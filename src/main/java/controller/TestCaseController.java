package com.infosys.automatedtest.controller;

import com.infosys.automatedtest.entity.TestCase;
import com.infosys.automatedtest.service.TestCaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testcases")
public class TestCaseController {

    private final TestCaseService service;

    public TestCaseController(TestCaseService service) {
        this.service = service;
    }

    // Add a test case
    @PostMapping
    public TestCase addTestCase(@RequestBody TestCase testCase) {
        return service.save(testCase);
    }

    // Get all test cases
    @GetMapping
    public List<TestCase> getAllTestCases() {
        return service.getAll();
    }
}
