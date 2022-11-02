package com.tax.employees.response;

public class EmployeeTaxResponse {

	private Long employeeCode;
	
	private String firstName;
	
	private String lastName;
	
	private Long yearlySalary;
	
	private double tax;
	
	private double cess;

	

	public Long getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(Long employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(Long yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getCess() {
		return cess;
	}

	public void setCess(double cess) {
		this.cess = cess;
	}

	public EmployeeTaxResponse() {
		super();
	}

	public EmployeeTaxResponse(Long employeeCode, String firstName, String lastName, Long yearlySalary, double tax, double cess) {
		super();
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearlySalary = yearlySalary;
		this.tax = tax;
		this.cess = cess;
	}
	
	
}
