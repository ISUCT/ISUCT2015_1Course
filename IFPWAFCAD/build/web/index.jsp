<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 30.05.2017, 12:39:12
    Author     : Данила
--%>
<sql:query var="readers" dataSource="jdbc/IFPWAFCAD">
    SELECT id_reader, last_name FROM reader
</sql:query>

  <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <style>
   <%@include file='style.css' %>
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Домашняя страница</title>
    </head>
    
    <body>
        <div id="container">
	<div id="header">
	<h2>Добро пожаловать!</h2>
	</div>
		 
	<div id="navigation">
            <h2>Вы находитесь на странице библиотеки. <br> Для просмотра сведений выберите свою фамилию ниже.</h2>
	</div>
		 
	<div id="content">
	<h2><form action="response.jsp">
                        <strong>Выберите фамилию:</strong>
                        <select name="id_reader">
        <c:forEach var="row" items="${readers.rows}">
            <option value="${row.id_reader}">${row.last_name}</option>
        </c:forEach>
                        </select>
                        <input type="submit" value="OK" name="submit" />
                    </form>
        </h2>
	</div>
</div>
    
</body>
</html>
