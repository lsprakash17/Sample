package com.sample.task.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.task.dto.Department;
import com.sample.task.repository.Departmentrepository;

@Repository
public class Departmentdao {
	@Autowired
	Departmentrepository repository;

	public void save(Department department) {
     repository.save(department);
	}

}
