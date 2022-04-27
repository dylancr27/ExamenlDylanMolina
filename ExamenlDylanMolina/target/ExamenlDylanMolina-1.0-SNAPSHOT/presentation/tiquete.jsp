<%-- 
    Document   : tiquete
    Created on : 25 abr. 2022, 20:00:55
    Author     : ESCIINF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>San Pedro Cinemas</title>
    </head>
    <body>
        <%@include file="/presentation/Header.jsp" %>    
        <form name="form" action="/ExamenlDylanMolina/presentation/CrearTiquete" method="post" >
            <h1>Consulta de Tiquete</h1>  
            <br>
            <div class="row">
                <div class="search-bar">
                    <input class="form-control" placeholder=" " type="text" name="codigoInput" required>
                </div>
            </div>
            <br>
            <input type="submit" value="Buscar">   
        </form>
    </body>
</html>
