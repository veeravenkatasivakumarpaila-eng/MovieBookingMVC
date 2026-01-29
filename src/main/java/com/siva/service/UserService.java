package com.siva.service;

import com.siva.dto.request.UpdatePasswordRequest;
import com.siva.dto.request.UserLoginRequest;
import com.siva.dto.request.UserRegistrationRequest;
import com.siva.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse registerUser(UserRegistrationRequest request);
    UserResponse loginUser(UserLoginRequest request);
    boolean updatePassword(UpdatePasswordRequest request);
    UserResponse getUserById(int userId);
    List<UserResponse> getAllUsers();
    boolean updateUserRole(int userId, String role);
}
