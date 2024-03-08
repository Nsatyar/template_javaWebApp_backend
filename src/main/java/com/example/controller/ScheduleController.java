package com.example.controller;

import com.example.dto.request.ShiftSetRequest;
import com.example.dto.response.ScheduleResponse;
import com.example.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/set/shift/{employeeId}")
    public ResponseEntity<ScheduleResponse> setShift(@PathVariable Long employeeId, @RequestBody ShiftSetRequest request) {
        ScheduleResponse response = scheduleService.setShift(employeeId, request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get/{employeeId}")
    public ResponseEntity<ScheduleResponse> getSchedule(@PathVariable Long employeeId) {
        ScheduleResponse response = scheduleService.getSchedule(employeeId);
        return ResponseEntity.ok(response);
    }
}
