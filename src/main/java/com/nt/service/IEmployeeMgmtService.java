/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nt.service;

import com.nt.entity.Employee;
import java.util.Optional;

/**
 *
 * @author Shiva
 */
public interface IEmployeeMgmtService {
    public Iterable<Employee> getAllEmployees();
    public String registerEmployee(Employee emp);
  
    public  Employee getEmployeeById(int id);
    public String deleteEmployeeById(int id);
}
