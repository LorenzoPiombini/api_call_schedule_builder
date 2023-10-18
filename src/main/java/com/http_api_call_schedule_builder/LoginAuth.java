package com.http_api_call_schedule_builder;

import java.io.IOException;
import java.net.MalformedURLException;

public class LoginAuth {

    public boolean authenticate(String username, String password) throws MalformedURLException, IOException {
        String payload = createJSON(username, password);

        return HttpMethod.postConnection(Constant.AUTHENTICATION_ENDPOINT, payload, null);

    }

    private String createJSON(String username, String password) {
        // create a JSON payload
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"username\": \"").append(username).append("\",");
        sb.append("\"password\": \"").append(password).append("\"");
        sb.append("}");

        return sb.toString();
    }
}
