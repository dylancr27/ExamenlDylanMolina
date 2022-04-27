package Data;

import cine.logic.Tiquete;
import java.util.ArrayList;

public class Data {

    ArrayList<Tiquete> listaTiquetes;

    public Data() {
        listaTiquetes = new ArrayList<>();
    }

    public ArrayList<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(ArrayList<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }
}
