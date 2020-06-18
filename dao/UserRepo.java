package com.merlind.merlindbatik.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merlind.merlindbatik.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	public Optional<User> findByUsername(String username);
	
}
