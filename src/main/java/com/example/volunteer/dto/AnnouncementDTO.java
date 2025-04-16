package com.example.volunteer.dto;

public class AnnouncementDTO {
    private String title;
    private String message;
    private String postedBy;

    public AnnouncementDTO() {}

    public AnnouncementDTO(String title, String message, String postedBy) {
        this.title = title;
        this.message = message;
        this.postedBy = postedBy;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getPostedBy() { return postedBy; }
    public void setPostedBy(String postedBy) { this.postedBy = postedBy; }
}
