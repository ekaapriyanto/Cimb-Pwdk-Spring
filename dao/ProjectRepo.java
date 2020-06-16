package com.merlind.merlindbatik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merlind.merlindbatik.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
