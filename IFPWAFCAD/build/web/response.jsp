<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : response
    Created on : 30.05.2017, 12:41:37
    Author     : Данила
--%>
<sql:query var="ReaderQuery" dataSource="jdbc/IFPWAFCAD">
    SELECT *  FROM reader, reader_book, book 
    where reader.id_reader=reader_book.id_reader and reader_book.id_book=book.id_book
    and reader_book.return_date is null and
    reader.id_reader = ? <sql:param value="${param.id_reader}"/>
</sql:query>
    
<c:set var="readerDetails" value="${ReaderQuery.rows[0]}"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
   <%@include file='style.css' %>
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${readerDetails.id_reader}</title>
    </head>
    <body>
        <div id="container">
	<div id="header">
            <h2>${readerDetails.id_reader}</h2>
	</div>
		 
	<div id="navigation">
	${readerDetails.last_name} ${readerDetails.first_name} ${readerDetails.patronymic}
	</div>
	
		 
	<div id="content">
            Адрес: ${readerDetails.address}<br> Телефон: ${readerDetails.phone}<br>  Взятые книги: ${readerDetails.name} - ${readerDetails.issue_date}
	</div>
		 
	<div id="clear">
		 
	</div>
							   
	<div id="footer">
	<h2>Все книги выдаются на срок до 7 дней!</h2>
	</div>
</div> 
    </body>
</html>