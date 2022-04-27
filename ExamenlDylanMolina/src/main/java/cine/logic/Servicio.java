package cine.logic;

import Data.Data;
import java.util.ArrayList;

public class Servicio {
        private static Servicio theInstance;

    public static Servicio instance() {
        if (theInstance == null) {
            theInstance = new Servicio();
        }
        return theInstance;
    }

    private Data data;

    public Servicio() {
        try{
            data = new Data();
        }
        catch(Exception e){
            data =  new Data();
        }
    }
    
    public ArrayList<Tiquete> getListaTiquetes(){
        return data.getListaTiquetes();
    }
}
