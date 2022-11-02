package com.tax.employees.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tax.employees.entity.Employee;
import com.tax.employees.response.AppResponse;
import com.tax.employees.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeesController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/save")
	public AppResponse save(@RequestBody @Valid Employee employee) {
		return service.save(employee);
	}
	
	@GetMapping("/tax")
	public AppResponse getTaxedEmployees() {
		return service.getEmployees();
	}
}
