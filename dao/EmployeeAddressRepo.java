package com.merlind.merlindbatik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merlind.merlindbatik.entity.EmployeeAddress;

public interface EmployeeAddressRepo extends JpaRepository<EmployeeAddress, Integer> {

}
