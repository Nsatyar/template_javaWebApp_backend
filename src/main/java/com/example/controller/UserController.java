package com.example.controller;

import com.example.dto.request.UserAddRequest;
import com.example.dto.request.UserLoginRequest;
import com.example.dto.request.UserRegistrationRequest;
import com.example.dto.request.UserUpdateRequest;
import com.example.dto.response.UserResponse;
import com.example.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRegistrationRequest request) {
        UserResponse response = userService.registerUser(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> login(@RequestBody UserLoginRequest request) {
        UserResponse response = userService.loginUser(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<UserResponse> addUser(@RequestBody UserAddRequest request) {
        UserResponse response = userService.addUser(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable Long userId) {
        UserResponse response = userService.deleteUser(userId);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Long userId, @RequestBody UserUpdateRequest request) {
        UserResponse response = userService.updateUser(userId, request);
        return ResponseEntity.ok(response);
    }
}
