package com.http_api_call_schedule_builder;

import java.io.IOException;
import java.net.MalformedURLException;

import com.http_api_call_schedule_builder.Shift.ReadShift;

public class App {
    public static void main(String[] args) {
        LoginAuth auth = new LoginAuth();
        ReadShift readShift = new ReadShift();

        try {
            System.out.println(auth.authenticate("MarcoBravo", "Bravo100"));
            System.out.println(readShift.readShift(1l));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
