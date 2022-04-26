package cine.logic;

public class Tanda {

    private String id;
    private String pelicula;
    private String fecha;
    private String hora;
    private String sala;

    public Tanda(String id, String pelicula, String fecha, String hora, String sala) {
        this.id = id;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
    }

    public Tanda() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Tanda{" + "id=" + id + ", pelicula=" + pelicula + ", fecha=" + fecha + ", hora=" + hora + ", sala=" + sala + '}';
    }
}
