package com.merlind.merlindbatik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;

import com.merlind.merlindbatik.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
