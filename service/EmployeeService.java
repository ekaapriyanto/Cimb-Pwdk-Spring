package com.merlind.merlindbatik.service;

import com.merlind.merlindbatik.entity.Employee;
import com.merlind.merlindbatik.entity.EmployeeAddress;

public interface EmployeeService{
	public void deleteEmployeeAddress(EmployeeAddress employeeAddress);
	
	public Employee updateEmployee(Employee employee);

}
