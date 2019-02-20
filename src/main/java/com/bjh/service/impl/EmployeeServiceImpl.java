package com.bjh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjh.bean.Employee;
import com.bjh.dao.EmployeeMapper;
import com.bjh.service.IEmployeeService;
import com.github.pagehelper.PageHelper;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> list() {
		PageHelper.startPage(1, 2);
		return employeeMapper.getAll();
	}

}
