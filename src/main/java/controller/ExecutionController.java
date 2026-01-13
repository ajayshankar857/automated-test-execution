package com.infosys.automatedtest.controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.infosys.automatedtest.service.ExecutionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecutionController {

    private final ExecutionService executionService;

    public ExecutionController(ExecutionService executionService) {
        this.executionService = executionService;
    }

    @GetMapping("/run-tests")   // ✅ CHANGE FROM @PostMapping
    public String runTests() {
        executionService.runAllTests();
        return "Tests executed successfully";
    }
}

