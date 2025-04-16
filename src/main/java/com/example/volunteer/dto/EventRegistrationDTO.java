package com.example.volunteer.dto;

import java.time.LocalDateTime;

public class EventRegistrationDTO {
    private String eventName;
    private LocalDateTime eventDateTime;
    private String venue;
    private String organization;
    private String contactInfo;

    public EventRegistrationDTO() {}

    public EventRegistrationDTO(String eventName, LocalDateTime eventDateTime, String venue, String organization, String contactInfo) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
        this.venue = venue;
        this.organization = organization;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public LocalDateTime getEventDateTime() { return eventDateTime; }
    public void setEventDateTime(LocalDateTime eventDateTime) { this.eventDateTime = eventDateTime; }

    public String getVenue() { return venue; }
    public void setVenue(String venue) { this.venue = venue; }

    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}
