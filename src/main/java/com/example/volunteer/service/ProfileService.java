package com.example.volunteer.service;

import com.example.volunteer.model.Profile;
import com.example.volunteer.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Optional<Profile> getProfileByUserId(Long userId) {
        return profileRepository.findByUserId(userId);
    }

    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile updateProfileSkills(Long userId, String skills) {
        Optional<Profile> optionalProfile = profileRepository.findByUserId(userId);
        if (optionalProfile.isPresent()) {
            Profile profile = optionalProfile.get();
            profile.setSkills(skills);
            return profileRepository.save(profile);
        }
        return null;
    }
}
