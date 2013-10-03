<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Team Planner Home</title>
</head>
<body>

<form action="saveEmployee.do" method="post">
Add Employees <br/>
First Name:<input type=text name="empFName"/><br/>
Last Name:<input type=text name="empLName"/><br/>
DOB:<input type=text name="empDob"/><br/>
DOJ:<input type=text name="empDoj"/><br/>
Employee Type:<input type=text name="empType"/><br/>
Skill Set id:<input type=text name="empSkillSet"/><br/>
Department id:<input type=text name="deptId"/><br/>
Designation id:<input type=text name="desigId"/><br/>
<input type="submit" value="Submit Data"><br/>
</form>

</body>
</html>