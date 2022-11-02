package com.tax.employees.service;

import com.tax.employees.entity.Employee;
import com.tax.employees.response.AppResponse;

public interface EmployeeService {

	public AppResponse save(Employee employee);

	public AppResponse getEmployees();

}
