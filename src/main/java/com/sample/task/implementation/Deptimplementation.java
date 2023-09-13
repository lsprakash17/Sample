package com.sample.task.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sample.task.dao.Departmentdao;
import com.sample.task.dto.Department;
import com.sample.task.repository.Departmentrepository;
import com.sample.task.service.Departmentservice;
import com.sample.taskhelper.ResponseStructure;

@Service
public class Deptimplementation implements Departmentservice {
	@Autowired
	Departmentdao departmentdao;
	
	@Autowired
	Departmentrepository repository;

	@Override
	public ResponseEntity<ResponseStructure<Department>> create(Department department) {
		departmentdao.save(department);
		ResponseStructure<Department> structure = new ResponseStructure<>();
		structure.setData(department);
		structure.setMsg("success");
		structure.setId(HttpStatus.PROCESSING.value());
		return new ResponseEntity<>(structure, HttpStatus.ACCEPTED);

	}

	@Override
	public ResponseStructure<Department> updateUser(int id, Department department) {
		// TODO Auto-generated method stub
		Department existingdetails = repository.findById(id).orElse(null);
		existingdetails.setName(department.getName());
		existingdetails.setAddress(department.getAddress());
		existingdetails.setEmployee(department.getEmployee());
		departmentdao.save(existingdetails);
		ResponseStructure<Department> response=new ResponseStructure<>();
        response.setMsg("success");
        response.setId(HttpStatus.FOUND.value());
		response.setData(existingdetails);
		return response;
	}

}
