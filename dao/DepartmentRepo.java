package com.merlind.merlindbatik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merlind.merlindbatik.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
	public Department findByName(String name);
}
