/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nt.service;

import com.nt.dao.IEmployeeRepository;
import com.nt.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Shiva
 */
@Service
public class EmployeeImplService implements IEmployeeMgmtService {

    @Autowired
    private IEmployeeRepository ier;

    @Override
    public Iterable<Employee> getAllEmployees() {

        return ier.findAll();
    }

    @Override
    public String registerEmployee(Employee emp) {

        return "EMPLOYEE SAVED WITH EID : " + ier.save(emp).geteId();
    }

    @Override
    public Employee getEmployeeById(int id) {

        Employee emp = ier.findById(id).get();
        return emp;
    }

    @Override
    public String deleteEmployeeById(int id) {
        ier.deleteById(id);
        return "EMPLOYEE DELETED WITH ID : " + id;
    }

}
