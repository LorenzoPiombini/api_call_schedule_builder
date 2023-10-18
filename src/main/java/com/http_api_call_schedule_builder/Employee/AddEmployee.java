package com.http_api_call_schedule_builder.Employee;

import java.io.IOException;
import java.net.MalformedURLException;

import com.http_api_call_schedule_builder.Constant;
import com.http_api_call_schedule_builder.HttpMethod;

/**
 * This class will make a connection to the employee Add endpoint,
 * generating the {@code JSON} payload from the user input.
 * users will be athenticated at this point.
 * the API works with JWT token authentication, everything is taken care off
 * {@link com.http_api_call_schedule_builder.HttpMethod} method
 * {@code postConnection()}
 * 
 * @author Lorenzo Piombini
 * @since 1.1
 */

public class AddEmployee {

    /**
     * 
     * add method will take the user input and generate the {@code JSON} payload.
     * using {@code try/catch} is raccomended
     * 
     * @param fisrtName
     * @param lastName
     * @param hourlyRate
     * @param jobTitle
     * @param age
     * @param role
     * @return {@code boolean}
     * @throws MalformedURLException
     * @throws IOException
     * 
     * 
     * 
     */
    public boolean add(String fisrtName, String lastName, double hourlyRate, String jobTitle, int age,
            String role) throws MalformedURLException, IOException {

        String payload = jsonConverter(fisrtName, lastName, hourlyRate, jobTitle, age,
                role);
        HttpMethod method = new HttpMethod();
        return HttpMethod.postConnection(Constant.EMPLOYEE_ADD_ENDPOINT, payload, method.getToken());

    }

    /**
     * this Method will generate the {@code JSON} payload
     * 
     * @param fisrtName
     * @param lastName
     * @param hourlyRate
     * @param jobTitle
     * @param age
     * @param role
     * @return
     */

    private String jsonConverter(String fisrtName, String lastName, double hourlyRate, String jobTitle, int age,
            String role) {
        String endJsonLine = "\",";
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"firstName\": \"").append(fisrtName).append(endJsonLine);
        sb.append("\"lastName\": \"").append(lastName).append(endJsonLine);
        sb.append("\"age\": \"").append(age).append(endJsonLine);
        sb.append("\"hourlyRate\": \"").append(hourlyRate).append(endJsonLine);
        sb.append("\"jobTitle\": \"").append(jobTitle).append(endJsonLine);
        sb.append("\"role\": \"").append(role).append("\"");
        sb.append("}");
        return sb.toString();

    }

}
