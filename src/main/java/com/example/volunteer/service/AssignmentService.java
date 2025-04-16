package com.example.volunteer.service;

import com.example.volunteer.model.Assignment;
import com.example.volunteer.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public List<Assignment> getAssignmentsByUser(Long userId) {
        return assignmentRepository.findByUserId(userId);
    }
}
