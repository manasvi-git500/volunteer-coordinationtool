package com.example.volunteer.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;


@Entity
@Table(name = "volunteer_profiles")
public class VolunteerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @Lob
    @Column(name = "profile_photo")
    private byte[] profilePhoto;

    @Column(columnDefinition = "TEXT")
    private String skills;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public byte[] getProfilePhoto() { return profilePhoto; }
    public void setProfilePhoto(byte[] profilePhoto) { this.profilePhoto = profilePhoto; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
}
