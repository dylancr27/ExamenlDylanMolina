package cine.logic;

import java.util.ArrayList;
import java.util.HashMap;

public class Modelo {

    private static Modelo uniqueInstance;

    public static Modelo instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Modelo();
        }
        return uniqueInstance;
    }

    HashMap<String, Pelicula> peliculas;
    HashMap<String, Tanda> tandas;

    private Modelo() {
        peliculas = new HashMap();
        peliculas.put("batman", new Pelicula("batman", "THE BATMAN", "2D DOB", "02:55", "Accion", "MAY12", 3000, 2500));
        peliculas.put("morbius", new Pelicula("morbius", "MORBIUS", "2D DOB", "01:45", "Accion", "TP", 3500, 2500));
        peliculas.put("jujutsu", new Pelicula("jujutsu", "JUJUTSU KAISEN 0", "2D SUB", "01:45", "Animadas", "MAY12", 2000, 1500));
        peliculas.put("tiposmalos", new Pelicula("tiposmalos", "LOS TIPOS MALOS", "2D DOB", "01:40", "Animadas", "TP", 2500, 2000));
        peliculas.put("sonic2", new Pelicula("sonic2", "SONIC 2", "2D DOB", "02:05", "Animadas", "TP", 3000, 2500));
        peliculas.put("animales3", new Pelicula("animales3", "ANIMALES FANTASTICOS", "32D DOB", "02:20", "Aventura", "TP", 3000, 2500));
        tandas = new HashMap();
        tandas.put("1", new Tanda("1", "batman", "2022-04-27", "02:30:00 p. m.", "6"));
        tandas.put("2", new Tanda("2", "batman", "2022-04-27", "06:00:00 p. m.", "4"));
        tandas.put("3", new Tanda("3", "morbius", "2022-04-27", "12:20:00 p. m.", "5"));
        tandas.put("4", new Tanda("4", "morbius", "2022-04-27", "02:35:00 p. m.", "5"));
        tandas.put("5", new Tanda("5", "morbius", "2022-04-27", "04:45:00 p. m.", "5"));
        tandas.put("6", new Tanda("6", "jujutsu", "2022-04-27", "11:00:00 a. m.", "3"));
        tandas.put("7", new Tanda("7", "jujutsu", "2022-04-27", "02:30:00 p. m.", "3"));
        tandas.put("8", new Tanda("8", "jujutsu", "2022-04-27", "04:40:00 p. m.", "3"));
        tandas.put("9", new Tanda("9", "jujutsu", "2022-04-27", "06:55:00 p. m.", "3"));
        tandas.put("10", new Tanda("10", "batman", "2022-04-28", "01:00:00 p. m.", "4"));
        tandas.put("11", new Tanda("11", "tiposmalos", "2022-04-28", "11:30:00 a. m.", "5"));
        tandas.put("12", new Tanda("12", "tiposmalos", "2022-04-28", "05:30:00 p. m.", "5"));
        tandas.put("13", new Tanda("13", "sonic2", "2022-04-28", "01:30:00 a. m.", "6"));
        tandas.put("14", new Tanda("14", "sonic2", "2022-04-28", "04:00:00 p. m.", "6"));
        tandas.put("15", new Tanda("15", "sonic2", "2022-04-29", "02:00:00 p. m.", "6"));
        tandas.put("16", new Tanda("16", "animales3", "2022-04-29", "01:00:00 p. m.", "5"));
        tandas.put("17", new Tanda("17", "animales3", "2022-04-29", "03:30:00 p. m.", "5"));
    }

    public HashMap<String, Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(HashMap<String, Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public HashMap<String, Tanda> getTandas() {
        return tandas;
    }

    public void setTandas(HashMap<String, Tanda> tandas) {
        this.tandas = tandas;
    }
}
