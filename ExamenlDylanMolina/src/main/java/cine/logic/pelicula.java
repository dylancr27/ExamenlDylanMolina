package cine.logic;

import java.util.ArrayList;

public class Pelicula {

    private String codigo;
    private String nombre;
    private String formato;
    private String duracion;
    private String genero;
    private String censura;
    private int precioGen;
    private int precioAM;
    private String fotografia;
    private ArrayList<Tanda> listaTandas;

    public Pelicula(String codigo, String nombre, String formato, String duracion, String genero, String censura, int precioGen, int precioAM, String fotografia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.formato = formato;
        this.duracion = duracion;
        this.genero = genero;
        this.censura = censura;
        this.precioGen = precioGen;
        this.precioAM = precioAM;
        this.fotografia = fotografia;
        this.listaTandas = null;
    }

    public Pelicula(String codigo, String nombre, String formato, String duracion, String genero, String censura, int precioGen, int precioAM) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.formato = formato;
        this.duracion = duracion;
        this.genero = genero;
        this.censura = censura;
        this.precioGen = precioGen;
        this.precioAM = precioAM;
        this.fotografia = "";
        this.listaTandas = null;
    }

    public Pelicula() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public int getPrecioGen() {
        return precioGen;
    }

    public void setPrecioGen(int precioGen) {
        this.precioGen = precioGen;
    }

    public int getPrecioAM() {
        return precioAM;
    }

    public void setPrecioAM(int precioAM) {
        this.precioAM = precioAM;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", nombre=" + nombre + ", formato=" + formato + ", duracion=" + duracion + ", genero=" + genero + ", censura=" + censura + ", precioGen=" + precioGen + ", precioAM=" + precioAM + ", fotografia=" + fotografia + '}';
    }
}
