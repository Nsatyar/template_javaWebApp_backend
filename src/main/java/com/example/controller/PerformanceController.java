package com.example.controller;

import com.example.dto.request.PerformanceCommentRequest;
import com.example.dto.request.PerformanceRateRequest;
import com.example.dto.response.PerformanceResponse;
import com.example.service.PerformanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/performance")
public class PerformanceController {

    private final PerformanceService performanceService;

    public PerformanceController(PerformanceService performanceService) {
        this.performanceService = performanceService;
    }

    @PostMapping("/rate")
    public ResponseEntity<PerformanceResponse> ratePerformance(@RequestBody PerformanceRateRequest request) {
        PerformanceResponse response = performanceService.ratePerformance(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/comment")
    public ResponseEntity<PerformanceResponse> commentPerformance(@RequestBody PerformanceCommentRequest request) {
        PerformanceResponse response = performanceService.commentPerformance(request);
        return ResponseEntity.ok(response);
    }
}
