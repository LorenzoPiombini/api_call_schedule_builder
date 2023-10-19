package com.http_api_call_schedule_builder.Shift;

import java.io.IOException;
import java.net.MalformedURLException;

import com.http_api_call_schedule_builder.Constant;
import com.http_api_call_schedule_builder.HttpMethod;

public class AddShiftToEmployee {

    public boolean addShiftToEmploye(Long shiftId, Long employeeId) throws IOException, MalformedURLException {

        return HttpMethod.putConnection(urlModifier(shiftId, employeeId), null);
    }

    private String urlModifier(Long shiftId, Long employeeId) {
        return Constant.ADD_SHIFT_TO_EMPLOYEE.replace("shiftId", Long.toString(shiftId)).replace("employeeId",
                Long.toString(employeeId));

    }
}
