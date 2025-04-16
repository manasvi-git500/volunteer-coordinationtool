package com.example.volunteer.dto;

public class ProfileDTO {
    private Long volunteerId;
    private byte[] image;
    private String skills;

    public ProfileDTO() {}

    public ProfileDTO(Long volunteerId, byte[] image, String skills) {
        this.volunteerId = volunteerId;
        this.image = image;
        this.skills = skills;
    }

    // Getters and Setters
    public Long getVolunteerId() { return volunteerId; }
    public void setVolunteerId(Long volunteerId) { this.volunteerId = volunteerId; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
}
