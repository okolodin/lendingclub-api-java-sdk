package com.lendingclub.http;

import org.springframework.util.StringUtils;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class HttpRequest {

	/**
	 * [Optional] System property name for HTTP connect timeout.
	 */
	public static final String LC_API_CONNECT_TIMEOUT = "LC_API_CONNECT_TIMEOUT";
	/**
	 * [Optional] System property name for HTTP read timeout.
	 */
	public static final String LC_API_READ_TIMEOUT = "LC_API_READ_TIMEOUT";

	public static final int sysPropConnectTimeout;
	public static final int sysPropReadTimeout;
	static {
		String envConnectTimeoutValue = System.getProperty(LC_API_CONNECT_TIMEOUT);
		if (!StringUtils.isEmpty(envConnectTimeoutValue)) {
			sysPropConnectTimeout = Integer.parseInt(envConnectTimeoutValue);
		} else {
			sysPropConnectTimeout = 0;
		}
		String envReadTimeoutValue = System.getProperty(LC_API_READ_TIMEOUT);
		if (!StringUtils.isEmpty(envReadTimeoutValue)) {
			sysPropReadTimeout = Integer.parseInt(envReadTimeoutValue);
		} else {
			sysPropReadTimeout = 0;
		}
	}

	static public HttpRequest formPost() { 
			return new HttpRequest()
				.method("POST")
				.header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	}

	/**
	 * HTTP connect timeout in milliseconds.
	 */
	private int connectTimeout = 0;
	/**
	 * HTTP read timeout in milliseconds.
	 */
	private int readTimeout = 0;

	public enum ResponseFormat { STREAM, BYTE, STRING };
	
	ResponseFormat responseFormat = ResponseFormat.STREAM;
	
	byte[] contentBytes;
	InputStream contentStream;

	List<Header> headers = new ArrayList<Header>();
	String method;
	String url;
	int expectedCode = -1; // -1 means no expected code specified.

	StringBuilder postParams = new StringBuilder();

	private String authorization;

	/**
	 * Default constructor sets connect/read timeouts if corresponding system properties are set.
	 * @see HttpRequest#LC_API_CONNECT_TIMEOUT
	 * @see HttpRequest#LC_API_READ_TIMEOUT
	 */
	public HttpRequest() {
		if (sysPropConnectTimeout > 0) {
			this.connectTimeout(sysPropConnectTimeout);
		}
		if (sysPropReadTimeout > 0) {
			this.connectTimeout(sysPropReadTimeout);
		}
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public HttpRequest connectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
		return this;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public HttpRequest readTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
		return this;
	}

	public List<Header> getHeaders() {
		return headers;
	}

	public String getMethod() {
		return method;
	}

	public byte[] getContentBytes() {
		if(postParams.length()>0) {
			try {
				return postParams.toString().getBytes("UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		} else {
			return contentBytes;
		}
	}

	public InputStream getContentStream() {
		return contentStream;
	}

	public String getUrl() {
		return url;
	}
	
	public HttpRequest expectsCode(int value) {
		expectedCode = value;
		return this;
	}

	public int getExpectedCode() {
		return expectedCode;
	}
	
	public HttpRequest header(String key, String value) {
		headers.add(new Header(key,value));
		
		return this;
	}

	public ResponseFormat getResponseFormat() {
		return responseFormat;
	}
	
	public HttpRequest responseFormat(ResponseFormat value) {
		responseFormat = value;
		return this;
	}

	public HttpRequest url(String value) {
		url = value;
		return this;
	}

	public HttpRequest method(String value) {
		method = value;
		return this;
	}
	
	public HttpRequest content(byte[] value) {
		if(postParams.length()>0) {
			throw new IllegalStateException("Cannot add request content as byte[] after post parameters have been set with param() or preEncodedParam()");
		}
		contentBytes = value;
		return this;
	}

	public HttpRequest param(String key, String value) {
		if(contentBytes!=null) {
			throw new IllegalStateException("Cannot add params to HttpRequest after content(byte[]) has been called with non-null value");
		}
		try {
			if(postParams.length()>0) {
				postParams.append("&"+key+"="+URLEncoder.encode(value, "UTF-8"));
			} else {
				postParams.append(key+"="+URLEncoder.encode(value, "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		return this;
	}

	public HttpRequest preEncodedParam(String key, String value) {
		if(contentBytes!=null) {
			throw new IllegalStateException("Cannot add params to HttpRequest after content(byte[]) has been called with non-null value");
		}
		if(postParams.length()>0) {
			postParams.append("&"+key+"="+value);
		} else {
			postParams.append(key+"="+value);
		}
		return this;
	}
	
//  possible future method
//	
//	public HttpRequest content(InputStream value) {
//		contentStream = value;
//		conn.setDoOutput(true);
//		return this;
//	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(method+" "+url+"\n");
		for(Header h : headers) {
			b.append(h.key+": "+h.value+"\n");
		}
		if(authorization!=null) {
			b.append("Authorization: "+authorization);
		}
		if(getContentBytes()!=null) {
			try {
				b.append("\n"+new String(getContentBytes(),"UTF-8")+"\n");
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		} else if(contentStream!=null) {
			b.append("\n[streamed content. Cannot print]\n");
		}
		return b.toString();
	}
	
	public class Header {
		String key;
		String value;
		public Header() {}
		public Header(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}

	public void setAuthorization(String value) {
		authorization = value;
	}
	
	public String getAuthorization() {
		return authorization;
	}
}