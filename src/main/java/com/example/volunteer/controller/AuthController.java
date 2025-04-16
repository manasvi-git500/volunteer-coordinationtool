package com.example.volunteer.controller;

import com.example.volunteer.model.User;
import com.example.volunteer.model.VerificationToken;
import com.example.volunteer.service.UserService;
import com.example.volunteer.service.VerificationTokenService;
import com.example.volunteer.util.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private VerificationTokenService tokenService;

    @Autowired
    private EmailSender emailSender;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        if (userService.emailExists(user.getEmail())) {
            return "Email already registered";
        }

        user.setEmailVerified(false);
        userService.saveUser(user);

        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken(token, user);
        tokenService.saveToken(verificationToken);

        String link = "http://localhost:8080/auth/verify?token=" + token;
        emailSender.sendEmail(user.getEmail(), "Email Verification", "Click the link to verify: " + link);

        return "Registration successful. Please verify your email.";
    }

    @GetMapping("/verify")
    public String verifyUser(@RequestParam String token) {
        Optional<VerificationToken> optionalToken = tokenService.findByToken(token);

        if (optionalToken.isPresent()) {
            User user = optionalToken.get().getUser();
            user.setEmailVerified(true);
            userService.saveUser(user);
            return "Email verified. You can now log in.";
        }
        return "Invalid verification token.";
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> payload) {
        String email = payload.get("email");
        String password = payload.get("password");

        Optional<User> userOptional = userService.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();

            if (!user.isEmailVerified()) {
                // Resend verification email
                String token = UUID.randomUUID().toString();
                VerificationToken verificationToken = new VerificationToken(token, user);
                tokenService.saveToken(verificationToken);

                String link = "http://localhost:8080/auth/verify?token=" + token;
                emailSender.sendEmail(user.getEmail(), "Email Verification", "Click to verify: " + link);

                return "Please verify your email first. A new verification link has been sent.";
            }

            if (user.getPassword().equals(password)) {
                return user.getRole().equals("admin") ? "redirect:/admin.html" : "redirect:/volunteer.html";
            } else {
                return "Invalid password";
            }
        }
        return "User not found";
    }
}
