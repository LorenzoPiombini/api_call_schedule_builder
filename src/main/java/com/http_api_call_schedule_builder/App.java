package com.http_api_call_schedule_builder;

import java.io.IOException;
import java.net.MalformedURLException;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.http_api_call_schedule_builder.Shift.ReadShift;

public class App {
    public static void main(String[] args) {
        LoginAuth auth = new LoginAuth();
        ReadShift readShift = new ReadShift();

        try {
            System.out.println(auth.authenticate("MarcoBravo", "Bravo100"));
            ObjectMapper mapper = new ObjectMapper();
            // List<Shift> allShift = mapper.readValue(readShift.readAllShift(), new
            // TypeReference<List<Shift>>() {});
            System.out.println(readShift.readAllShift());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
