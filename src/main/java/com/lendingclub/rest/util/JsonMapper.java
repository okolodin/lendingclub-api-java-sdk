package com.lendingclub.rest.util;

import com.lendingclub.http.HttpResponse;
import com.lendingclub.rest.FolioError;
import com.lendingclub.rest.FolioErrors;
import com.lendingclub.rest.FolioResponse;
import com.lendingclub.rest.FolioResponseType;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class JsonMapper<T> {

    private Class<T> type;

    public JsonMapper(Class<T> type) {
        this.type = type;
    }

    public FolioResponse<T> parseResponse(ObjectMapper jsonMapper, HttpResponse response)
            throws IOException {
        T value = null;
        FolioError[] errors = null;
        boolean isError = false;
        int responseCode = response.getResponseCode();
        if (responseCode == 400) {
            // in case of HTTP 400 folio may return either normal (similar to code 200) json payload or array or errors
            // try to parse response as type T, then as an error
            try {
                // the most common error could be due to values missing in FolioNoteStatus
                // check the response and update FolioNoteStatus
                value = jsonMapper.readValue(response.getString(), type);
            } catch (Exception e) {
                isError = true;
                try {
                    FolioErrors errorsResponse = jsonMapper.readValue(response.getString(), FolioErrors.class);
                    if (errorsResponse != null) {
                        errors = errorsResponse.getErrors();
                    }
                } catch (Exception e1) {
                    String errorText = e1.getMessage() + " " + response.getString();
                    FolioError error = new FolioError();
                    error.setMessage(errorText);
                    errors = new FolioError[] {error};
                }
                // REST WS returns errors in multiple different formats.
                // return errors as raw content if error detection fails or yet unknown
            }
        } else {
            value = jsonMapper.readValue(response.getStream(), type);
        }

        FolioResponse<T> result = new FolioResponse<T>();
        result.setResponseCode(responseCode);
        result.setResponseType(FolioResponseType.fromInt(responseCode));
        result.setValue(value);
        result.setErrors(errors);
        result.setError(isError);
        return result;
    }
}
