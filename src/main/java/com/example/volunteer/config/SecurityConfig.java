package com.example.volunteer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .cors(cors -> {}) // Enables CORS
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/",                            // Root
                    "/index.html",                  // Main page
                    "/login.html",                  // Login page
                    "/signup.html",                 // Signup page
                    "/register.html",               // Registration page
                    "/api/auth/**",                 // Auth APIs
                    "/css/**",                      // CSS files
                    "/js/**",                       // JS files
                    "/images/**",                   // Image resources
                    "/favicon.ico",
                    "/volunteer.html",
                    "/admin-dashboard.html",
                    "/events.html",
                    "/attendance.html",
                    "/assignments.html",
                    "/announcements.html",
                    "/health-events.html",
                    "/education-events.html",
                    "/environment-events.html",
                    "/registration.html",
                    "/about.html",
                    "/contact.html"
                    
                    // Favicon
                ).permitAll()
                .anyRequest().authenticated()
            );

        return http.build();
    }
}
