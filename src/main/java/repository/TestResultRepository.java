package com.infosys.automatedtest.repository;

import com.infosys.automatedtest.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {
}
