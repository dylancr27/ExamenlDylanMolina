/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema.logic;

import java.util.ArrayList;

/**
 *
 * @author ESCIINF
 */
public class pelicula {
    
    private String codigo;
    private String nombre;
    private String formato;
    private String duracion;
    private String genero;
    private String Censura;
    private int precioGen;
    private int precioAM;
    private String fotografia;
    ArrayList<tandas> tandasPeli;

    public pelicula() {
    }

    public pelicula(String codigo, String nombre, String formato, String duracion, String genero, String Censura, int precioGen, int precioAM) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.formato = formato;
        this.duracion = duracion;
        this.genero = genero;
        this.Censura = Censura;
        this.precioGen = precioGen;
        this.precioAM = precioAM;
        this.tandasPeli= new ArrayList<>();
        this.fotografia="";
        
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
        return Censura;
    }

    public void setCensura(String Censura) {
        this.Censura = Censura;
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

    public ArrayList<tandas> getTandasPeli() {
        return tandasPeli;
    }

    public void setTandasPeli(ArrayList<tandas> tandasPeli) {
        this.tandasPeli = tandasPeli;
    }

    public void setFoto(String examen1DylanMolinaimagesbatmanpng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
