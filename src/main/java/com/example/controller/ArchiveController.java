package com.example.controller;

import com.example.dto.response.ArchiveResponse;
import com.example.service.ArchiveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/archive")
public class ArchiveController {

    private final ArchiveService archiveService;

    public ArchiveController(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }

    @GetMapping("/get/personal-info/{employeeId}")
    public ResponseEntity<ArchiveResponse> getPersonalInfo(@PathVariable Long employeeId) {
        ArchiveResponse response = archiveService.getPersonalInfo(employeeId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get/work-experience/{employeeId}")
    public ResponseEntity<ArchiveResponse> getWorkExperience(@PathVariable Long employeeId) {
        ArchiveResponse response = archiveService.getWorkExperience(employeeId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get/training-record/{employeeId}")
    public ResponseEntity<ArchiveResponse> getTrainingRecord(@PathVariable Long employeeId) {
        ArchiveResponse response = archiveService.getTrainingRecord(employeeId);
        return ResponseEntity.ok(response);
    }
}
