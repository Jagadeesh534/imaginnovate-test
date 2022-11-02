package com.tax.employees.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tax.employees.entity.Employee;
import com.tax.employees.repo.EmployeesRepo;
import com.tax.employees.response.AppResponse;
import com.tax.employees.response.EmployeeTaxResponse;
import com.tax.employees.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeesRepo employeesRepo;
	
	@Override
	public AppResponse save(Employee employee) {
		employeesRepo.save(employee);
		return new AppResponse("success", "Emp Id is " + employee.getId());
	}

	@Override
	public AppResponse getEmployees() {
		List<Employee> ems = employeesRepo.findAll();
		List<EmployeeTaxResponse> texedEployees = new ArrayList<>();
		if(!ems.isEmpty()) {
			ems.stream().forEach(e-> {
				texedEployees.add(calculateTax(e));
			});
		}
		return new AppResponse("success", texedEployees);
	}
	
	private EmployeeTaxResponse calculateTax(Employee e) {
		double tax = 0.0;
		Long yearlySalary = e.getSalary() * 12L ;
		EmployeeTaxResponse employee = new EmployeeTaxResponse();
		employee.setFirstName(e.getFirstName());
		employee.setLastName(e.getLastName());
		employee.setEmployeeCode(e.getId());
		employee.setYearlySalary(yearlySalary);
		
		if(yearlySalary > 250000  ) {
			if(yearlySalary <= 500000L) {
				tax =  (yearlySalary - 250000) * (5.0/100.0);
				employee.setTax(tax);
			}
			
			if(yearlySalary > 500000L && yearlySalary <= 1000000) {
				employee.setTax((yearlySalary -250000) * (10.0/100.0));
			}
			
			if(yearlySalary > 1000000 ) {
				employee.setTax((yearlySalary - 250000)* (20.0/100.0));
			}
			
			employee.setCess((yearlySalary - 250000)* (2.0/100.0));
		} else {
			employee.setTax(0);
			employee.setCess(0);
		}
		return employee;
	}
	

}
