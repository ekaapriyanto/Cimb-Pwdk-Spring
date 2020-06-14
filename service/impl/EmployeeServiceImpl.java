package com.merlind.merlindbatik.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merlind.merlindbatik.dao.EmployeeAddressRepo;
import com.merlind.merlindbatik.dao.EmployeeRepo;
import com.merlind.merlindbatik.entity.EmployeeAddress;
import com.merlind.merlindbatik.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeAddressRepo employeeAddressRepo;
	
	@Override
	public void deleteEmployeeAddress(EmployeeAddress employeeAddress) {
		employeeAddress.getEmployee().setEmployeeAddress(null);
		employeeAddress.setEmployee(null);
		employeeAddressRepo.delete(employeeAddress);
	}
}
