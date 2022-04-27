<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="cine.logic.Pelicula"%>
<%@page import="cine.logic.Tanda"%>
<%@page import="cine.logic.Modelo"%>
<%@page import="java.util.HashMap"%>
<%@page import="cine.presentation.cartelera.Model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     Model model = (Model) request.getAttribute("model");
     ArrayList<Tanda> tandas = model.getListaTandas();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>San Pedro Cinemas</title>
        <link rel="stylesheet" href="/ExamenlDylanMolina/css/cartelera.css"/>
    </head>
    <body>
        <%@include file="/presentation/Header.jsp"%>
        <h1>Escoge la fecha</h1>
        <div class="navbar">
            <ul>
                <li><a href="/ExamenlDylanMolina/presentation/Cartelera27?fecha=2022-04-27">27 de abril</a></li>
                <li><a href="/ExamenlDylanMolina/presentation/Cartelera27?fecha=2022-04-28">28 de Abril</a></li>
                <li><a href="/ExamenlDylanMolina/presentation/Cartelera27?fecha=2022-04-29">29 de Abril</a></li>
            </ul>
        </div>
        <div class="container">
            <table>
                <thead>
                    <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col">Fecha</th>
                        <th scope="col">Hora</th>
                        <th scope="col">Sala</th>
  
                    </tr>  
                </thead>
                <tbody>
                    <% for (Tanda entry :tandas) {%>
                    <tr>
                        <td><%= entry.getPelicula()%></td>
                        <td><%= entry.getFecha()%></td>
                        <td><%= entry.getHora()%></td>
                        <td><%= entry.getSala()%></td>
                    </tr>
                    <%}%>
                </tbody>              
            </table>  
        </div>
    </body>
</html>
<%!
    private String erroneo(String campo, Map<String, String> errores) {
        if ((errores != null) && (errores.get(campo) != null)) {
            return "is-invalid";
        } else {
            return "";
        }
    }

    private String title(String campo, Map<String, String> errores) {
        if ((errores != null) && (errores.get(campo) != null)) {
            return errores.get(campo);
        } else {
            return "";
        }
    }

    private Map<String, String[]> getForm(Model model) {
        Map<String, String[]> values = new HashMap<>();
        return values;
    }
%> 