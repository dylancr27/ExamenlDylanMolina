package cine.presentation.cartelera;

import cine.logic.Pelicula;
import cine.logic.Tiquete;
import java.util.ArrayList;

public class Model {

    Tiquete current;
    ArrayList<Tiquete> listaTiquetes;

    public Model() {
        this.reset();
    }

    public void reset() {
        ArrayList<Tiquete> rows = new ArrayList<>();
        current = null;
        this.setListaTiquetes(rows);
    }

    public Tiquete getCurrent() {
        return current;
    }

    public void setCurrent(Tiquete current) {
        this.current = current;
    }

    public ArrayList<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(ArrayList<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }

    public String setFoto(Pelicula peli) {
        String fotografia;
        if (peli.getCodigo().equals("batman")) {
            peli.setFotografia("/ExamenlDylanMolina/images/batman.png");
        } else if (peli.getCodigo().equals("morbius")) {
            peli.setFotografia("/ExamenlDylanMolina/images/morbius.png");
        } else if (peli.getCodigo().equals("jujutsu")) {
            peli.setFotografia("/ExamenlDylanMolina/images/jujutsu.png");
        } else if (peli.getCodigo().equals("sonic2")) {
            peli.setFotografia("/ExamenlDylanMolina/images/sonic2.png");
        } else if (peli.getCodigo().equals("animales3")) {
            peli.setFotografia("/ExamenlDylanMolina/images/animales3.png");
        }
        fotografia = peli.getFotografia();
        return fotografia;
    }
}
