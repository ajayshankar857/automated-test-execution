package com.infosys.automatedtest.repository;

import com.infosys.automatedtest.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepository extends JpaRepository<TestCase, Long> {
}
