package com.infosys.automatedtest.service;

import com.infosys.automatedtest.entity.TestCase;
import com.infosys.automatedtest.entity.TestResult;
import com.infosys.automatedtest.repository.TestCaseRepository;
import com.infosys.automatedtest.repository.TestResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutionService {

    private final TestCaseRepository testCaseRepository;
    private final TestResultRepository testResultRepository;

    public ExecutionService(TestCaseRepository testCaseRepository,
                            TestResultRepository testResultRepository) {
        this.testCaseRepository = testCaseRepository;
        this.testResultRepository = testResultRepository;
    }

    public void runAllTests() {

        List<TestCase> testCases = testCaseRepository.findAll();
        System.out.println("Total test cases: " + testCases.size());

        for (TestCase testCase : testCases) {

            long start = System.currentTimeMillis();

            // Fake execution logic (for internship demo)
            String status = "PASS";
            String message = "Executed successfully";

            long duration = System.currentTimeMillis() - start;

            TestResult result = new TestResult();
            result.setTestName(testCase.getName());
            result.setStatus(status);
            result.setDuration(duration);
            result.setMessage(message);

            // 🔥 THIS LINE IS THE MOST IMPORTANT
            testResultRepository.save(result);
        }
    }
}
