package com.example.volunteer.service;

import com.example.volunteer.model.Attendance;
import com.example.volunteer.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAttendanceByUser(Long userId) {
        return attendanceRepository.findByUserId(userId);
    }

    public Map<String, Long> getAttendanceSummary(Long userId) {
        List<Attendance> records = attendanceRepository.findByUserId(userId);
        long attended = records.stream().filter(a -> "Attended".equalsIgnoreCase(a.getStatus())).count();
        long missed = records.size() - attended;
        Map<String, Long> summary = new HashMap<>();
        summary.put("attended", attended);
        summary.put("missed", missed);
        return summary;
    }
}
