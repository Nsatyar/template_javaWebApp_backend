package com.example.controller;

import com.example.dto.request.SalarySetRequest;
import com.example.dto.response.SalaryResponse;
import com.example.service.SalaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salary")
public class SalaryController {

    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @PostMapping("/set")
    public ResponseEntity<SalaryResponse> setSalary(@RequestBody SalarySetRequest request) {
        SalaryResponse response = salaryService.setSalary(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/pay/{employeeId}")
    public ResponseEntity<SalaryResponse> paySalary(@PathVariable Long employeeId) {
        SalaryResponse response = salaryService.paySalary(employeeId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get/{employeeId}")
    public ResponseEntity<SalaryResponse> getSalary(@PathVariable Long employeeId) {
        SalaryResponse response = salaryService.getSalary(employeeId);
        return ResponseEntity.ok(response);
    }
}
