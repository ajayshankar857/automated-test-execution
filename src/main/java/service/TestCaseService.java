package com.infosys.automatedtest.service;

import com.infosys.automatedtest.entity.TestCase;
import com.infosys.automatedtest.repository.TestCaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseService {

    private final TestCaseRepository repository;

    public TestCaseService(TestCaseRepository repository) {
        this.repository = repository;
    }

    public TestCase save(TestCase testCase) {
        return repository.save(testCase);
    }

    public List<TestCase> getAll() {
        return repository.findAll();
    }
}
