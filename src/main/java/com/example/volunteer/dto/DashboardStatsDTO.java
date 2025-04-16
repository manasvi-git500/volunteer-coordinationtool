package com.example.volunteer.dto;

public class DashboardStatsDTO {
    private int registeredEvents;
    private int attendedEvents;
    private int missedEvents;
    private int submittedAssignments;
    private int announcementsCount;

    public DashboardStatsDTO() {}

    public DashboardStatsDTO(int registeredEvents, int attendedEvents, int missedEvents, int submittedAssignments, int announcementsCount) {
        this.registeredEvents = registeredEvents;
        this.attendedEvents = attendedEvents;
        this.missedEvents = missedEvents;
        this.submittedAssignments = submittedAssignments;
        this.announcementsCount = announcementsCount;
    }

    // Getters and Setters
    public int getRegisteredEvents() { return registeredEvents; }
    public void setRegisteredEvents(int registeredEvents) { this.registeredEvents = registeredEvents; }

    public int getAttendedEvents() { return attendedEvents; }
    public void setAttendedEvents(int attendedEvents) { this.attendedEvents = attendedEvents; }

    public int getMissedEvents() { return missedEvents; }
    public void setMissedEvents(int missedEvents) { this.missedEvents = missedEvents; }

    public int getSubmittedAssignments() { return submittedAssignments; }
    public void setSubmittedAssignments(int submittedAssignments) { this.submittedAssignments = submittedAssignments; }

    public int getAnnouncementsCount() { return announcementsCount; }
    public void setAnnouncementsCount(int announcementsCount) { this.announcementsCount = announcementsCount; }
}
