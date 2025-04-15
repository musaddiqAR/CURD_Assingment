package com.example.employee.record.service;

import com.example.employee.record.entity.Employee;
import com.example.employee.record.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public void createEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public Employee updateEmployee(int id, Employee employee) {
        Employee newEmployee = employeeRepo.findById(id).orElse(null);
        if(newEmployee == null){
            System.out.println("Todo not found with this id: "+id);
        }else
        {
            newEmployee.setName(employee.getName());
            newEmployee.setDepartment(employee.getDepartment());
            newEmployee.setSalary(employee.getSalary());
            newEmployee = employeeRepo.save(newEmployee);
        }
        System.out.println("Updated Employee is : "+newEmployee);
        return newEmployee;
    }

    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
