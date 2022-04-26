package cine.logic;

public class Compra {
    
    private int boletosGeneral;
    private int boletosAdultos;
    private String nombre;
    private String cedula;
    private String numeroTarjeta;
    private String codigoTiquete;

    public Compra() {
    }

    public Compra(int boletosGeneral, int boletosAdultos, String nombre, String cedula, String numeroTarjeta, String codigoTiquete) {
        this.boletosGeneral = boletosGeneral;
        this.boletosAdultos = boletosAdultos;
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoTiquete = codigoTiquete;
    }

    public int getBoletosGeneral() {
        return boletosGeneral;
    }

    public void setBoletosGeneral(int boletosGeneral) {
        this.boletosGeneral = boletosGeneral;
    }

    public int getBoletosAdultos() {
        return boletosAdultos;
    }

    public void setBoletosAdultos(int boletosAdultos) {
        this.boletosAdultos = boletosAdultos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCodigoTiquete() {
        return codigoTiquete;
    }

    public void setCodigoTiquete(String codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }

    
    
    
   
}
