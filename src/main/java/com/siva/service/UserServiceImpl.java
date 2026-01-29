package com.siva.service;

import com.siva.dao.UserDAO;
import com.siva.dto.request.UpdatePasswordRequest;
import com.siva.dto.request.UserLoginRequest;
import com.siva.dto.request.UserRegistrationRequest;
import com.siva.dto.response.UserResponse;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public UserResponse registerUser(UserRegistrationRequest request) {
        // Validate request
        if (request.getUsername() == null || request.getEmail() == null || request.getPassword() == null) {
            throw new IllegalArgumentException("Username, email, and password are required.");
        }
        return userDAO.registerUser(request);
    }

    @Override
    public UserResponse loginUser(UserLoginRequest request) {
        // Validate request
        if (request.getEmail() == null || request.getPassword() == null) {
            throw new IllegalArgumentException("Email and password are required.");
        }
        return userDAO.loginUser(request);
    }

    @Override
    public boolean updatePassword(UpdatePasswordRequest request) {
        // Validate request
        if (request.getUserId() <= 0 || request.getOldPassword() == null || request.getNewPassword() == null) {
            throw new IllegalArgumentException("User ID, old password, and new password are required.");
        }
        return userDAO.updatePassword(request);
    }

    @Override
    public UserResponse getUserById(int userId) {
        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid user ID.");
        }
        return userDAO.getUserById(userId);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public boolean updateUserRole(int userId, String role) {
        if (userId <= 0 || role == null) {
            throw new IllegalArgumentException("User ID and role are required.");
        }
        return userDAO.updateUserRole(userId, role);
    }
}
