package com.example.volunteer.service;

import com.example.volunteer.model.EventRegistration;
import com.example.volunteer.repository.EventRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventRegistrationService {
    @Autowired
    private EventRegistrationRepository eventRegistrationRepository;

    public EventRegistration registerEvent(EventRegistration registration) {
        return eventRegistrationRepository.save(registration);
    }

    public List<EventRegistration> getRegistrationsByUser(Long userId) {
        return eventRegistrationRepository.findByUserId(userId);
    }
}
