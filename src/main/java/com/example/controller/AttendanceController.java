package com.example.controller;

import com.example.dto.request.AttendanceRecordRequest;
import com.example.dto.response.AttendanceResponse;
import com.example.service.AttendanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @PostMapping("/record")
    public ResponseEntity<AttendanceResponse> recordAttendance(@RequestBody AttendanceRecordRequest request) {
        AttendanceResponse response = attendanceService.recordAttendance(request);
        return ResponseEntity.ok(response);
    }
}
