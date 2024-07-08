package com.Excler.Employeedashboard.Repository;

import com.Excler.Employeedashboard.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}