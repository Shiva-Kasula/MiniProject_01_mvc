<%@page isELIgnored="false" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<h1>WELCOME TO EMPLOYEE REGISTRATIONS</h1>
<frm:form action="submit" method="POST" ModelAttribute="emp">
    <frm:errors path="*"/>
    
        <tr>
            <td>EMPLOYEE NAME : </td>
            <td> <frm:input path="eName"/> </td>
        </tr>
        
         <tr>
            <td>EMPLOYEE DESG : </td>
            <td> <frm:input path="job"/> </td>
        </tr> 
        
         <tr>
            <td>EMPLOYEE SAL : </td>
            <td> <frm:input path="sal"/> </td>
        </tr>
        
         <tr>
            <td>EMPLOYEE DEPTNO : </td>
            <td><frm:input path="deptNo"/> </td>
        </tr>
         <tr>
             <td><input type="submit" value="submit"> </td>
            <td> <input type="reset" value="cancel"></td>
        </tr>
        
    
            
    
</frm:form>

    
