package cine.presentation.cartelera;

import cine.logic.Servicio;
import cine.logic.Tanda;
import cine.logic.Tiquete;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "carteleraController", urlPatterns = {
    "/presentation/Cartelera",
    "/presentation/CrearTiquete",
    "/ExamenlDylanMolina/presentation/Cartelera?=2022-04-27",
    "/ExamenlDylanMolina/presentation/Cartelera?=2022-04-28",
    "/ExamenlDylanMolina/presentation/Cartelera?=2022-04-29"
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
        request.setAttribute("model", new Model());
        String viewUrl = "";
        switch (request.getServletPath()) {
            case "/presentation/Cartelera":
                viewUrl = this.show(request);
                break;
            case "/presentation/CrearTiquete":
                viewUrl = this.crearTiquete(request);
                break;
            case "/ExamenlDylanMolina/presentation/Cartelera?=2022-04-27":
                viewUrl = this.show27(request);
                break;
            case "/ExamenlDylanMolina/presentation/Cartelera?=2022-04-28":
                viewUrl = this.show28(request);
                break;
            case "/ExamenlDylanMolina/presentation/Cartelera?=2022-04-29":
                viewUrl = this.show29(request);
                break;
        }
        request.getRequestDispatcher(viewUrl).forward(request, response);
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
        try {
            return "/presentation/Cartelera.jsp";
        } catch (Exception ex) {
            return "";
        }
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
        try {
            Model model = (Model) request.getAttribute("model");
            cine.logic.Modelo domainModel = cine.logic.Modelo.instance();
            ArrayList<Tanda> l = domainModel.getTandas();
            ArrayList<Tanda> listaTandasAux = new ArrayList<>();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).getFecha().equals("2022-04-27")) {
                    listaTandasAux.add(l.get(i));
                }
            }
            model.setListaTandas(listaTandasAux);
            return "/presentation/Cartelera.jsp";
        } catch (Exception ex) {
            return "";
        }
    }

    public String tandas28(HttpServletRequest request) {
        try {
            Model model = (Model) request.getAttribute("model");
            cine.logic.Modelo domainModel = cine.logic.Modelo.instance();
            ArrayList<Tanda> l = domainModel.getTandas();
            ArrayList<Tanda> listaTandasAux = new ArrayList<>();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).getFecha().equals("2022-04-28")) {
                    listaTandasAux.add(l.get(i));
                }
            }
            model.setListaTandas(listaTandasAux);
            return "/presentation/Cartelera.jsp";
        } catch (Exception ex) {
            return "";
        }
    }

    public String tandas29(HttpServletRequest request) {
        try {
            Model model = (Model) request.getAttribute("model");
            cine.logic.Modelo domainModel = cine.logic.Modelo.instance();
            ArrayList<Tanda> l = domainModel.getTandas();
            ArrayList<Tanda> listaTandasAux = new ArrayList<>();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).getFecha().equals("2022-04-29")) {
                    listaTandasAux.add(l.get(i));
                }
            }
            model.setListaTandas(listaTandasAux);
            return "/presentation/Cartelera.jsp";
        } catch (Exception ex) {
            return "";
        }
    }

    public String crearTiquete(HttpServletRequest request) {
        Model model = (Model) request.getAttribute("model");
        ArrayList<Tiquete> listaTiquetes;
        listaTiquetes = Servicio.instance().getListaTiquetes();
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
