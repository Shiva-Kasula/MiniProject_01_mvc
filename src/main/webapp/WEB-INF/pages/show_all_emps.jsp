<%-- 
    Document   : show_all_emps
    Created on : 16-Apr-2023, 7:39:42 pm
    Author     : Shiva
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${!empty allEmps}">
                <h1 style="text-align:center">ALL EMPLOYEES</h1>
                <table border="1" align="center" bgcolor="cyan">
                    <tr style="color:red"><th>EMPNNO</th><th>ENAME</th><th>JOB</th><th>SAL</th><th>DEPT</th><<th colspan="2">OPERATIONS</th></tr>
                    <c:forEach var="emp" items="${allEmps}">
                        <tr style="color:blue">
                            <td>${emp.eId}</td>
                            <td>${emp.eName}</td> 
                             <td>${emp.job}</td>
                              <td>${emp.sal}</td>
                              <td>${emp.deptNo}</td>
                              
                              <td ><a href="emp_edit?no=${emp.eId}">EDIT</a></td>
                              <td ><a href="delete_emp?no=${emp.eId}" onclick="return confirm('DO U WANT TO DELETE THIS RECORD ?')">DELETE</a></td>
                              
                        </tr>
                    </c:forEach>
                </table>
            </c:when>
                <c:otherwise>
                     <h1>EMPLOYEES NOT FOUND</h1>
                </c:otherwise>
                   
        </c:choose>
                     <h3 style="text-align: center">${delete_result}</h3>
                     <h3 style="text-align: center">${resultmsg}</h3>
    <center>
        <a href="show_emp_form"><<h2>ADD EMPLOYEE</h2></a>
          <<h2><a href="./">HOME</a></h2>
        
        </center>
    </body>
</html>
