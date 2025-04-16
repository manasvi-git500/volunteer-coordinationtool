package com.example.volunteer.dto;

import java.time.LocalDate;

public class AssignmentDTO {
    private String title;
    private LocalDate dueDate;
    private boolean submitted;

    public AssignmentDTO() {}

    public AssignmentDTO(String title, LocalDate dueDate, boolean submitted) {
        this.title = title;
        this.dueDate = dueDate;
        this.submitted = submitted;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public boolean isSubmitted() { return submitted; }
    public void setSubmitted(boolean submitted) { this.submitted = submitted; }
}
