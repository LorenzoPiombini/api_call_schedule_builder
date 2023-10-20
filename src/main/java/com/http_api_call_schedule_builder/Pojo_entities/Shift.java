package com.http_api_call_schedule_builder.Pojo_entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shift {

    @JsonProperty("id")
    private long id;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("date")
    private String date;
    @JsonProperty("employees")
    private List<Employee> employees;
    @JsonProperty("shiftDuration")
    private double hoursShift;

    public Shift() {
    }

    public Shift(long id, String start, String end, String date, List<Employee> employees, double hoursShift) {
        this.id = id;
        this.startTime = start;
        this.endTime = end;
        this.date = date;
        this.employees = employees;
        this.hoursShift = hoursShift;

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public double getHoursShift() {
        return this.hoursShift;
    }

    public void setHoursShift(double hoursShift) {
        this.hoursShift = hoursShift;
    }

}
