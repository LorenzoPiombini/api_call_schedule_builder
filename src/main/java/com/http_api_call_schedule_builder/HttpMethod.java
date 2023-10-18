package com.http_api_call_schedule_builder;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMethod {
    private static String authentication;

    public static boolean postConnection(String url, String payload, String token)
            throws MalformedURLException, IOException {
        URL endPoint = new URL(url);
        HttpURLConnection con = (HttpURLConnection) endPoint.openConnection();

        con.setRequestMethod("POST");
        con.setDoOutput(true);
        con.setRequestProperty("Content-type", "application/json");
        if (token != null) {
            con.setRequestProperty("Authorization", authentication);

        }
        try (OutputStream os = con.getOutputStream()) {
            byte[] input = payload.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responeCode = con.getResponseCode();

        switch (responeCode) {
            case 200:
                if (token == null || token.isEmpty()) {
                    authentication = con.getHeaderField("Authorization");

                }
                return true;
            case 201:
                return true;
            default:
                return false;
        }
    }

    public static boolean putConnection(String url, String payload, String token)
            throws IOException, MalformedURLException {
        URL endpoint = new URL(url);

        HttpURLConnection con = (HttpURLConnection) endpoint.openConnection();

        con.setRequestMethod("PUT");
        con.setDoOutput(true);
        con.setRequestProperty("Content-type", "application/json");
        con.setRequestProperty("Authorization", authentication);

        if (payload != null) {
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = payload.getBytes("utf-8");
                os.write(input, 0, input.length);

            }
        }

        switch (con.getResponseCode()) {
            case 201:
                return true;

            default:
                return false;
        }

    }

    public String getToken() {
        return authentication;
    }
}
