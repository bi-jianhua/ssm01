package com.bjh.dao;

import java.util.List;

import com.bjh.bean.Employee;

public interface EmployeeMapper {

	Employee selectEmp(Integer id);
	
	List<Employee> getAll();

}
