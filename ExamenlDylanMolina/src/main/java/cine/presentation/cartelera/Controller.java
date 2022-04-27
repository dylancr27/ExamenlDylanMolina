package cine.presentation.cartelera;

import cine.logic.Tanda;
import cine.logic.Tiquete;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "carteleraController", urlPatterns = {
    "/presentation/Cartelera",
    "/presentation/CrearTiquete",
    "/presentation/Cartelera27",
    "/presentation/Cartelera28",
    "/presentation/Cartelera29",
    "/presentation/BuscarTiquete"

})
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd;
        request.setAttribute("model", new Model());
        String viewUrl = "";
        Model model = new Model();
        model.setListaTandas(cine.logic.Modelo.instance().getTandas());
        request.setAttribute("model", model);
        switch (request.getServletPath()) {
            case "/presentation/Cartelera":
                viewUrl = this.show(request);
                break;
            case "/presentation/CrearTiquete":
                viewUrl = this.crearTiquete(request);
                break;
            case "/presentation/Cartelera27":
                viewUrl = this.show27(request);
                break;
            case "/ExamenlDylanMolina/presentation/Cartelera28":
                viewUrl = this.show28(request);
                break;
            case "/ExamenlDylanMolina/presentation/Cartelera29":
                viewUrl = this.show29(request);
                break;
            case "/presentation/BuscarTiquete":
                viewUrl = this.buscarTiquete(request);
                break;
        }
        rd = request.getRequestDispatcher(viewUrl);
        rd.forward(request, response);
    }

    public String show(HttpServletRequest request) {
        return this.showAction(request);
    }

    public String show27(HttpServletRequest request) {
        return this.tandas27(request);
    }

    public String show28(HttpServletRequest request) {
        return this.tandas28(request);
    }

    public String show29(HttpServletRequest request) {
        return this.tandas29(request);
    }

    public String showAction(HttpServletRequest request) {
        Model model = new Model();
        ArrayList<Tanda> l = cine.logic.Modelo.instance().getTandas();
        model.setListaTandas(l);
        request.setAttribute("model", model);
        return "/presentation/Cartelera.jsp";
    }

    public String showAction27(HttpServletRequest request) {
        try {
            return tandas27(request);
        } catch (Exception ex) {
            return "";
        }
    }

    public String showAction28(HttpServletRequest request) {
        try {
            return tandas27(request);
        } catch (Exception ex) {
            return "";
        }
    }

    public String showAction29(HttpServletRequest request) {
        try {
            return tandas27(request);
        } catch (Exception ex) {
            return "";
        }
    }

    public String tandas27(HttpServletRequest request) {
        String fecha = request.getParameter("fecha");
        Model model = new Model();
        ArrayList<Tanda> l = cine.logic.Modelo.instance().getTandas();
        ArrayList<Tanda> listaTandasAux = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getFecha().equals(fecha)) {
                listaTandasAux.add(l.get(i));
            }
        }
        model.setListaTandas(listaTandasAux);
        request.setAttribute("model", model);
        return "/presentation/Cartelera.jsp";
    }

    public String tandas28(HttpServletRequest request) {
        String fecha = request.getParameter("fecha");
        Model model = new Model();
        ArrayList<Tanda> l = cine.logic.Modelo.instance().getTandas();
        ArrayList<Tanda> listaTandasAux = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getFecha().equals(fecha)) {
                listaTandasAux.add(l.get(i));
            }
        }
        model.setListaTandas(listaTandasAux);
        request.setAttribute("model", model);
        return "/presentation/Cartelera.jsp";
    }

    public String tandas29(HttpServletRequest request) {
        String fecha = request.getParameter("fecha");
        Model model = new Model();
        ArrayList<Tanda> l = cine.logic.Modelo.instance().getTandas();
        ArrayList<Tanda> listaTandasAux = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getFecha().equals(fecha)) {
                listaTandasAux.add(l.get(i));
            }
        }
        model.setListaTandas(listaTandasAux);
        request.setAttribute("model", model);
        return "/presentation/Cartelera.jsp";
    }

    public String crearTiquete(HttpServletRequest request) {
        Model model = (Model) request.getAttribute("model");
        ArrayList<Tiquete> listaTiquetes;
        listaTiquetes = cine.logic.Modelo.instance().getListaTiquetes();
        Tiquete tiquete = new Tiquete();
        //int boletosGeneral, int boletosAdultos, String nombre, String cedula, String numeroTarjeta, String codigoTiquete
        try {
            listaTiquetes.add(new Tiquete(
                    Integer.parseInt(request.getParameter("tiquetesG")),
                    Integer.parseInt(request.getParameter("tiquetesAM")),
                    request.getParameter("nombreInput"),
                    request.getParameter("cedulaInput"),
                    request.getParameter("cedulaInput"),
                    cine.logic.Tiquete.generarCodigo()
            ));
            model.setListaTiquetes(listaTiquetes);
            return "/presentation/Cartelera.jsp";
        } catch (Exception ex) {
            return "/presentation/Cartelera.jsp";
        }
    }

    public String buscarTiquete(HttpServletRequest request) {
        try {
            String aux = request.getParameter("codigoInput");
            Model model = (Model) request.getAttribute("model");
            Tiquete tiquete = new Tiquete();
            ArrayList<Tiquete> lista = cine.logic.Modelo.instance().getListaTiquetes();
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getCodigoTiquete().equals(aux)) {
                    tiquete = lista.get(i);
                }
            }
            model.setCurrent(tiquete);
            return "/presentation/ResultadoTiquete.jsp";
        } catch (Exception ex) {
            return "/presentation/Cartelera.jsp";
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
