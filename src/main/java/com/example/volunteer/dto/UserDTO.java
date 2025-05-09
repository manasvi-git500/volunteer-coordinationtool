package com.example.volunteer.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String role;
    private boolean emailVerified;

    public UserDTO() {}

    public UserDTO(Long id, String name, String email, String role, boolean emailVerified) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.emailVerified = emailVerified;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public boolean isEmailVerified() { return emailVerified; }
    public void setEmailVerified(boolean emailVerified) { this.emailVerified = emailVerified; }
}
