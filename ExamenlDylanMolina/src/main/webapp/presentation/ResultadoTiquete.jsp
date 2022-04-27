<%@page import="java.util.ArrayList"%>
<%@page import="cine.logic.Tiquete"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="cine.presentation.cartelera.Model"%>
<%@page import="cine.logic.Modelo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Model model = (Model) request.getAttribute("model");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="/presentation/Header.jsp"%>
        <h1><%=model.getCurrent().toString()%></h1>
    </body>
</html>
