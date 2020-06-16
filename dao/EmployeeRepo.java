package com.merlind.merlindbatik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merlind.merlindbatik.entity.Department;
import com.merlind.merlindbatik.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public Iterable<Employee> findByDepartment(Department department);
}
