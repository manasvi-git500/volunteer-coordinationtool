package com.example.volunteer.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;


@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long volunteerId;

    @Lob
    private byte[] image;

    private String skills;

    public Profile() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVolunteerId() { return volunteerId; }
    public void setVolunteerId(Long volunteerId) { this.volunteerId = volunteerId; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
}
