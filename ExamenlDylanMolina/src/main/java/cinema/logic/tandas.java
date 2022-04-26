/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema.logic;

/**
 *
 * @author ESCIINF
 */
public class tandas {
    
    private String id;
    private String Pelicula;
    private String fecha;
    private String hora;
    private int sala;

    public tandas() {
    }

    public tandas(String id, String Pelicula, String fecha, String hora, int sala) {
        this.id = id;
        this.Pelicula = Pelicula;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    
    
    
}
