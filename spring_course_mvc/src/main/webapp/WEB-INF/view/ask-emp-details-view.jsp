<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h1>Dear Employee, please enter your details</h1>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>      --%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do you want
    <%--        Lada <form:radiobutton path="carBrand" value="Lada"/>
        Audi <form:radiobutton path="carBrand" value="Audi"/>
        BMW <form:radiobutton path="carBrand" value="BMW"/>      --%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    
        <br><br>
        <input type="submit" value="OK">
    
    </form:form>
    
    
    </body>
    
    </html>