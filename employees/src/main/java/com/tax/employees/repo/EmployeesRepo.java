package com.tax.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tax.employees.entity.Employee;

@Repository
public interface EmployeesRepo extends JpaRepository<Employee, Long> {

}
