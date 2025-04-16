package com.example.volunteer.dto;

import java.time.LocalDate;

public class AttendanceDTO {
    private String eventName;
    private LocalDate eventDate;
    private String status;

    public AttendanceDTO() {}

    public AttendanceDTO(String eventName, LocalDate eventDate, String status) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.status = status;
    }

    // Getters and Setters
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public LocalDate getEventDate() { return eventDate; }
    public void setEventDate(LocalDate eventDate) { this.eventDate = eventDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
