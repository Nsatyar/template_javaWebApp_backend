package com.example.controller;

import com.example.dto.request.PermissionAssignRequest;
import com.example.dto.request.UserRoleSetRequest;
import com.example.dto.response.PermissionResponse;
import com.example.service.PermissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PutMapping("/set/user-role/{userId}")
    public ResponseEntity<PermissionResponse> setUserRole(@PathVariable Long userId, @RequestBody UserRoleSetRequest request) {
        PermissionResponse response = permissionService.setUserRole(userId, request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/assign/permission/{userId}")
    public ResponseEntity<PermissionResponse> assignPermission(@PathVariable Long userId, @RequestBody PermissionAssignRequest request) {
        PermissionResponse response = permissionService.assignPermission(userId, request);
        return ResponseEntity.ok(response);
    }
}
