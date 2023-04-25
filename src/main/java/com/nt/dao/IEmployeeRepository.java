/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nt.dao;

import com.nt.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Shiva
 */
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
    
}
