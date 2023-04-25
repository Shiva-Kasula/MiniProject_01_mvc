<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>


<h1>WELCOME TO EMPLOYEE REGISTRATIONS</h1>
<form action="register" method="POST">
    <table bgcolor="cyan" align="center">
        
        <tr>
            <td>EMPLOYEE DEPTNO : </td>
            <td><input type="text" name="deptNo"/> </td>
        </tr>
        
        <tr>
            <td>EMPLOYEE NAME : </td>
            <td> <input type="text " name="eName" /> </td>
        </tr>
        
         <tr>
            <td>EMPLOYEE DESG : </td>
            <td> <input type="text" name="job"/> </td>
        </tr> 
        
         <tr>
            <td>EMPLOYEE SAL : </td>
            <td> <input type="text" name="sal"/> </td>
        </tr>
        
         
         <tr>
             <td><input type="submit" value="register"> </td>
            <td> <input type="reset" value="cancel"></td>
        </tr>
        
    </table>
    
</form>
