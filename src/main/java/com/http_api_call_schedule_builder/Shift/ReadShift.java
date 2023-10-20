package com.http_api_call_schedule_builder.Shift;

import java.io.IOException;
import java.net.MalformedURLException;

import com.http_api_call_schedule_builder.Constant;
import com.http_api_call_schedule_builder.HttpMethod;

public class ReadShift {

    public String readShift(long shiftId) throws MalformedURLException, IOException {
        HttpMethod getMethod = new HttpMethod();
        if (HttpMethod.getConnection(urlModifier(shiftId))) {
            return getMethod.getJson();
        } else {
            return getMethod.getErrorMessage();
        }
    }

    private String urlModifier(long shiftId) {
        return Constant.READ_SHIFT.replace("shiftId", Long.toString(shiftId));
    }
}
