package com.merlind.merlindbatik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merlind.merlindbatik.dao.DepartmentRepo;
import com.merlind.merlindbatik.dao.EmployeeRepo;
import com.merlind.merlindbatik.entity.Department;
import com.merlind.merlindbatik.service.DepartmentService;

@RestController
@RequestMapping("/departmens")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired 
	private EmployeeRepo employeeRepo;
	
	@GetMapping
	public Iterable<Department> getDepartments() {
		return departmentService.getAllDepartments();
	}
	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	
	@DeleteMapping("/{departmentId}")
	public void deleteDepartment(@PathVariable int departmentId) {
		Department findDepartment = departmentRepo.findById(departmentId).get();
		
		findDepartment.getEmployees().forEach(employee -> {
			employee.setDepartment(null);
			employeeRepo.save(employee);
		});
	}
}
