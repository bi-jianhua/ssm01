package com.bjh.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bjh.bean.Employee;
import com.bjh.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Map<String, Object> map) {
		List<Employee> emps = employeeService.list();
		map.put("emps", emps);
		return "list";
	}
	
}
