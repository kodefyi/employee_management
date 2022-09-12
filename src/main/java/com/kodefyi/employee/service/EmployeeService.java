package com.kodefyi.employee.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.kodefyi.employee.entity.Employee;


@Service
public interface EmployeeService {
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(int studentId);

	Employee updateEmployee(Employee student);

	void deleteEmployee(int employeeId);
}
