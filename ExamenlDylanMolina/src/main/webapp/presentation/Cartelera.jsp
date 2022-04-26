<%@page import="java.util.Map"%>
<%@page import="cine.logic.Pelicula"%>
<%@page import="cine.logic.Tanda"%>
<%@page import="cine.logic.Modelo"%>
<%@page import="java.util.HashMap"%>
<%@page import="cine.presentation.cartelera.Model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HashMap<String, Pelicula> peliculas = Modelo.instance().getPeliculas();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>San Pedro Cinemas</title>
        <link rel="stylesheet" href="/ExamenlDylanMolina/css/cartelera.css"/>
    </head>
    <body>
        <%@include file="/presentation/Header.jsp" %>
        <h1>Selecciona la fecha</h1> 
        <div class="navbar">         
            <ul> 
                <li><a href="#">27 de abril</a></li>
                <li><a href="#">28 de Abril</a></li>
                <li><a href="#">29 de Abril</a></li>
                <li><a href="#">30 de Abril</a></li>
            </ul>
        </div>
        <table class="table table-bordered table-striped mb-0 " id="example"style="">
            <thead>
                <tr>
                    <th scope="col">Nombre</th>
                    <th scope="col">Formato</th>
                    <th scope="col">Duracion</th>
                    <th scope="col">Genero</th>
                    <th scope="col">Censura</th>
                    <th scope="col">Horario</th>
                    <th scope="col">Precio general</th> 
                    <th scope="col">Precio am</th>   
                </tr>  
            </thead>
            <tbody>
                <% for (Map.Entry<String, Pelicula> entry : peliculas.entrySet()) {%>
                <tr>
                    <td><%= entry.getValue().getNombre()%> </td>
                    <td><%= entry.getValue().getFormato()%> </td>
                    <td><%= entry.getValue().getDuracion()%> </td>
                    <td><%= entry.getValue().getGenero()%> </td>
                    <td><%= entry.getValue().getCensura()%> </td>
                    <td><%= entry.getValue().getPrecioGen()%> </td>
                    <td><%= entry.getValue().getPrecioAM()%> </td>
                </tr>
                <%}%>
            </tbody>              
        </table>  
    </body>
</html>
