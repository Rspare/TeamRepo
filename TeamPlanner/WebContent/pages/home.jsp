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
Add Employees
First Name<input type=text name="empFName"/>
Last Name<input type=text name="empLName"/>
DOB<input type=text name="empDob"/>
DOJ<input type=text name="empDoj"/>
Employee Type<input type=text name="empType"/>
Skill Set id<input type=text name="empSkillSet"/>
Department id<input type=text name="deptId"/>
Designation id<input type=text name="desigId"/>
<input type="submit" value="Submit">
</form>

</body>
</html>