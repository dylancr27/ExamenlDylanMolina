<%@page import="java.util.ArrayList"%>
<%@page import="cine.logic.Tiquete"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="cine.presentation.tiquete.Model"%>
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
        <% Map<String, String> errores = (Map<String, String>) request.getAttribute("errores"); %>
        <% Map<String, String[]> form = (errores == null) ? this.getForm(model) : request.getParameterMap();%>
        <form name="form" action="/ExamenlDylanMolina/presentation/CrearTiquete" method="post" > 
            <div class="panel" style="width:30%;">
                <div>Indicar datos de compra</div>
                <br>
                <div class="row">
                    <label for="tiquetesG">Cantidad de boletos generales:</label>
                    <select name="tiquetesG" id="boletosGGSelect" class="form-control">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <br>
                <div class="row">
                    <label for="tiquetesAM">Cantidad de boletos generales:</label>
                    <select name="tiquetesAM" id="boletosAMSelect" class="form-control">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <br>
                <div class="row">
                    <div>Nombre</div>
                    <div><input class="form-control" placeholder=" " type="text" name="nombreInput" required></div>
                </div>
                <br>
                <div class="row">
                    <div>Numero de cedula</div>
                    <div><input class="form-control" placeholder=" " type="text" name="cedulaInput" required></div>
                </div>
                <br>
                <div class="row">
                    <div>Numero de tarjeta</div>
                    <div><input class="form-control" placeholder=" " type="text" name="tarjetaInput" required></div>
                </div>
                <br>
                <input type="submit" value="Pagar">
            </div>
        </form>
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