package cine.presentation.tiquete;

import java.util.ArrayList;
import cine.logic.Tiquete;

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
}
