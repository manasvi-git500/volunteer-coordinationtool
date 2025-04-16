package com.example.volunteer.controller;

import com.example.volunteer.model.*;
import com.example.volunteer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private EventRegistrationService eventRegistrationService;

    @Autowired
    private AssignmentService assignmentService;

    @Autowired
    private AnnouncementService announcementService;

    @Autowired
    private ProfileService profileService;

    // Attendance summary pie chart
    @GetMapping("/attendance-summary/{userId}")
    public Map<String, Long> getAttendanceSummary(@PathVariable Long userId) {
        return attendanceService.getAttendanceSummary(userId);
    }

    // Dashboard statistics
    @GetMapping("/dashboard-stats/{userId}")
    public Map<String, Integer> getDashboardStats(@PathVariable Long userId) {
        int registeredEvents = eventRegistrationService.getRegistrationsByUser(userId).size();
        int attended = attendanceService.getAttendanceByUser(userId).size();
        int assignments = assignmentService.getAssignmentsByUser(userId).size();
        int announcements = announcementService.getAllAnnouncements().size();

        Map<String, Integer> stats = new HashMap<>();
        stats.put("events", registeredEvents);
        stats.put("attendance", attended);
        stats.put("assignments", assignments);
        stats.put("announcements", announcements);

        return stats;
    }

    // Profile section
    @GetMapping("/profile/{userId}")
    public Profile getProfile(@PathVariable Long userId) {
        return profileService.getProfileByUserId(userId).orElse(null);
    }

    @PostMapping("/profile")
    public Profile updateProfile(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }

    @PutMapping("/profile/skills/{userId}")
    public Profile addSkills(@PathVariable Long userId, @RequestBody String skills) {
        return profileService.updateProfileSkills(userId, skills);
    }

    // Event registration
    @PostMapping("/register")
    public EventRegistration registerForEvent(@RequestBody EventRegistration registration) {
        return eventRegistrationService.registerEvent(registration);
    }

    // Attendance list
    @GetMapping("/attendance/{userId}")
    public List<Attendance> getAttendance(@PathVariable Long userId) {
        return attendanceService.getAttendanceByUser(userId);
    }
}
