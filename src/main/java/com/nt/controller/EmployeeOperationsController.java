package com.nt.controller;

import com.nt.entity.Employee;
import com.nt.service.EmployeeImplService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeeOperationsController {
   // @Autowired
   // EmployeeValidator ev;
    @Autowired
    private EmployeeImplService service;

    @GetMapping("/")
    public String showHome() {

        return "welcome";
    }

    @GetMapping("/report")
    public String showAllEmployees(Map<String,Object> map) {
        Iterable<Employee> list = service.getAllEmployees();
        map.put("allEmps",list);
        return "show_all_emps";

    }

    @GetMapping("/show_emp_form")
    public String addEmployeeForm() {
           
        return "reg_emp";

    }
    @PostMapping("/register")
    public String addEmployee(@ModelAttribute("emp") Employee emp,RedirectAttributes atts){
//        if(ev.supports(Employee.class)){
//            ev.validate(emp, error);
//            if(error.hasErrors())
//                return "register";
//        }
        
         String msg=service.registerEmployee(emp);
         atts.addFlashAttribute("resultmsg",msg);
        return "redirect:report";
        
    }
    @GetMapping("/emp_edit")
    public String showUpdateForm(@RequestParam("no") int id,Map<String,Object> map){
//        if(ev.supports(Employee.class)){
//            ev.validate(emp, error);
//            if(error.hasErrors())
//                return "emp_edit";
//        }
        
     Employee emp=service.getEmployeeById(id);
        System.out.println(emp);
         String ename=emp.geteName();
         String job=emp.getJob();
         int sal=emp.getSal();
         int dept=emp.getDeptNo();
         int eId=emp.geteId();
     
          map.put("ename",ename);
          map.put("job",job);
          map.put("sal",sal);
          map.put("dept",dept);
          map.put("eId", eId);
          
        return "update_emp";
    }
    @GetMapping("/delete_emp")
    public String deleteEmployee(@RequestParam("no") int id,RedirectAttributes atts  ){
          
        String result=service.deleteEmployeeById(id);
          atts.addFlashAttribute("delete_result", result);
       return "redirect:report";
    }
    

}
