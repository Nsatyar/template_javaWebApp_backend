package com.example.controller;

import com.example.dto.request.DataAnalysisRequest;
import com.example.dto.response.DataAnalysisResponse;
import com.example.service.DataAnalysisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data-analysis")
public class DataAnalysisController {

    private final DataAnalysisService dataAnalysisService;

    public DataAnalysisController(DataAnalysisService dataAnalysisService) {
        this.dataAnalysisService = dataAnalysisService;
    }

    @PostMapping("/analyze")
    public ResponseEntity<DataAnalysisResponse> analyzeData(@RequestBody DataAnalysisRequest request) {
        DataAnalysisResponse response = dataAnalysisService.analyzeData(request);
        return ResponseEntity.ok(response);
    }
}
