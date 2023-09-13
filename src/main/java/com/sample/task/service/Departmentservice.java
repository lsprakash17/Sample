package com.sample.task.service;

import org.springframework.http.ResponseEntity;

import com.sample.task.dto.Department;
import com.sample.taskhelper.ResponseStructure;


public interface Departmentservice {

	public ResponseEntity<ResponseStructure<Department>> create(Department department);

	public ResponseStructure<Department> updateUser(int id, Department department);

}
