package com.sample.task.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.task.dto.Department;
import com.sample.task.service.Departmentservice;
import com.sample.taskhelper.ResponseStructure;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/departments")
public class Controler 
{
	@Autowired
	Departmentservice service;

	@PostMapping
	@Operation(summary = "Create Librarian Account")
	public ResponseEntity<ResponseStructure<Department>> createDepartMentDetails(@RequestBody Department  department)
	{
    return service.create(department);
	}
	 @PutMapping("/{id}")
	 public ResponseStructure<Department> edit(@PathVariable int id,@RequestBody Department department )
	 {
		 return service.updateUser(id, department);
	 }

}
