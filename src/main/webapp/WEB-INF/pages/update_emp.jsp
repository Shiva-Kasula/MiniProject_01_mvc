<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>


<h1 style="text-align: center">PLEASE UPDATE THE DETAILS</h1>
<form action="/register" method="POST">
    <table bgcolor="cyan" align="center">
        
         <tr>
            <td>EMPLOYEE ID : </td>
            <td><input type="text" name="eId" value="${eId}" readonly="true"/> </td>
        </tr>
        
        <tr>
            <td>EMPLOYEE DEPTNO : </td>
            <td><input type="text" name="deptNo" value="${dept}"/> </td>
        </tr>
        
        <tr>
            <td>EMPLOYEE NAME : </td>
            <td> <input type="text " name="eName" value="${ename}"/> </td>
        </tr>
        
         <tr>
            <td>EMPLOYEE DESG : </td>
            <td> <input type="text" name="job" value="${job}"/> </td>
        </tr> 
        
         <tr>
            <td>EMPLOYEE SAL : </td>
            <td> <input type="text" name="sal" value="${sal}"/> </td>
        </tr>
        
         
         <tr>
             <td><input type="submit" value="update"> </td>
            <td> <input type="reset" value="cancel"></td>
        </tr>
        
    </table>
    
</form>
