package com.merlind.merlindbatik.service;

import com.merlind.merlindbatik.entity.Department;

public interface DepartmentService {
	public Iterable<Department> getAllDepartments();

	public Department addDepartment(Department department);

}
