package com.cbtcompanion.app.service;

import com.cbtcompanion.app.dto.UserRegistrationDto;
import com.cbtcompanion.app.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    User findByUsername(String username);
    User save(UserRegistrationDto registration);
}
