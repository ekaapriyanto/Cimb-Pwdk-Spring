package com.merlind.merlindbatik.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merlind.merlindbatik.dao.DepartmentRepo;
import com.merlind.merlindbatik.entity.Department;
import com.merlind.merlindbatik.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepo departmentRepo;
	//Department
	@Override
	public Iterable<Department> getAllDepartments(){
		return departmentRepo.findAll();
	}
	
	@Override
	@Transactional
	public Department addDepartment(Department department) {
		department.setId(0);
		return departmentRepo.save(department);
	}

}
