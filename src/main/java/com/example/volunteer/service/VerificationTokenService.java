package com.example.volunteer.service;

import com.example.volunteer.model.VerificationToken;
import com.example.volunteer.repository.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VerificationTokenService {
    @Autowired
    private VerificationTokenRepository tokenRepository;

    public VerificationToken saveToken(VerificationToken token) {
        return tokenRepository.save(token);
    }

    public Optional<VerificationToken> findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
