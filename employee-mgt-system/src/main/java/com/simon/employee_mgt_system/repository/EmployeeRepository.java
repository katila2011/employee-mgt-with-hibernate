package com.simon.employee_mgt_system.repository;

import com.simon.employee_mgt_system.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
