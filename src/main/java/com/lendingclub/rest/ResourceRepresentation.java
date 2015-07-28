package com.lendingclub.rest;

import com.lendingclub.http.HttpResponse;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ResourceRepresentation {
	
	public static final ObjectMapper jsonMapper = new ObjectMapper();

	HttpResponse response;

	public ResourceRepresentation(HttpResponse value) {
		response = value;
	}

	public <T> T as(Class<T> clazz) {
		try {
			return (T) jsonMapper.readValue(response.getStream(), clazz);
		} catch (JsonParseException e) {
			throw new ResourceException(e);
		} catch (JsonMappingException e) {
			throw new ResourceException(e);
		} catch (IOException e) {
			throw new ResourceException(e);
		}
	}
	
	public Map<?,?> asMap() {
		try {
			return jsonMapper.readValue(response.getStream(), Map.class);
		} catch (JsonParseException e) {
			throw new ResourceException(e);
		} catch (JsonMappingException e) {
			throw new ResourceException(e);
		} catch (IOException e) {
			throw new ResourceException(e);
		}
	}

	public List<?> asList() {
		try {
			return jsonMapper.readValue(response.getStream(), List.class);
		} catch (JsonParseException e) {
			throw new ResourceException(e);
		} catch (JsonMappingException e) {
			throw new ResourceException(e);
		} catch (IOException e) {
			throw new ResourceException(e);
		}
	}
}
