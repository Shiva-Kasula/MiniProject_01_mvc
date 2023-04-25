/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nt.validations;

import com.nt.entity.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author Shiva
 */
public class EmployeeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
       return clazz.isAssignableFrom(Employee.class);
        
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee emp=(Employee)target;
        if(emp.geteName()==null|| emp.geteName()==""||emp.geteName().length()==0){
        
            errors.rejectValue("eName","emp.name.required");
        }
    }
    
}
