package com.example.controller;

import com.example.dto.request.DepartmentAdjustRequest;
import com.example.dto.request.PositionAdjustRequest;
import com.example.dto.response.EmployeeResponse;
import com.example.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PutMapping("/adjust/department/{employeeId}")
    public ResponseEntity<EmployeeResponse> adjustDepartment(@PathVariable Long employeeId, @RequestBody DepartmentAdjustRequest request) {
        EmployeeResponse response = employeeService.adjustDepartment(employeeId, request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/adjust/position/{employeeId}")
    public ResponseEntity<EmployeeResponse> adjustPosition(@PathVariable Long employeeId, @RequestBody PositionAdjustRequest request) {
        EmployeeResponse response = employeeService.adjustPosition(employeeId, request);
        return ResponseEntity.ok(response);
    }
}
