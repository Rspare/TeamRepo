<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Team Planner Home</title>
</head>
<body>

<form action="saveEmployee.do" method="post">
<table>Add Employees 
First Name:<input type=text name="empFName"/><br/>
Last Name:<input type=text name="empLName"/><br/>
Select Department:  <form:select path="deptLst" id="deptId" name="deptId">
        <form:option value="">Select Dept 
          <form:options items="${deptLst}" var="department" name="${department.deptId}" itemValue="deptId" itemLabel="deptName" value="${department.deptId}"></form:options></form:option>
      </form:select> <br/>
Select Designation:
<form:select path="desigLst" id="desigId" name="desigId">
        <form:option value="">Select Designation 
          <form:options items="${desigLst}" var="designation" itemValue="desId" itemLabel="desName" value="${designation.desId}"></form:options></form:option>
      </form:select> <br/>

<input type="submit" value="Submit Data">
</table>
</form>

</body>
</html>