package com.example.volunteer.controller;

import com.example.volunteer.model.Attendance;
import com.example.volunteer.service.AttendanceService;
import com.example.volunteer.service.AssignmentService;
import com.example.volunteer.service.EventRegistrationService;
import com.example.volunteer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private EventRegistrationService eventRegistrationService;

    @Autowired
    private AssignmentService assignmentService;

    @Autowired
    private UserService userService;

    // Example: Live analytics chart data
    @GetMapping("/analytics/attendance")
    public Map<String, Long> getOverallAttendanceStats() {
        // Aggregate attendance from all users (for simplicity here we return fixed data)
        Map<String, Long> stats = new HashMap<>();
        stats.put("attended", 250L);
        stats.put("missed", 50L);
        return stats;
    }

    // Example: Top Volunteers leaderboard
    @GetMapping("/leaderboard")
    public List<String> getTopVolunteers() {
        // Placeholder for real leaderboard logic
        return Arrays.asList("John Doe", "Jane Smith", "Ali Khan");
    }

    // Example: Pending actions
    @GetMapping("/pending-actions")
    public List<String> getPendingActions() {
        return Arrays.asList("Approve volunteer registrations", "Review assignment submissions");
    }
}
