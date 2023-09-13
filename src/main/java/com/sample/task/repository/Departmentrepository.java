package com.sample.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.task.dto.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Integer>

{

}
