package cine.presentation.cartelera;

import cine.logic.Pelicula;

public class Model {

    
    public String setFoto(Pelicula peli){
    String fotografia;
    if(peli.getCodigo().equals("batman")){
    peli.setFotografia("/ExamenlDylanMolina/images/batman.png");
    }else if(peli.getCodigo().equals("morbius")){
    peli.setFotografia("/ExamenlDylanMolina/images/morbius.png");
    }else if(peli.getCodigo().equals("jujutsu")){
    peli.setFotografia("/ExamenlDylanMolina/images/jujutsu.png");
    }else if(peli.getCodigo().equals("sonic2")){
    peli.setFotografia("/ExamenlDylanMolina/images/sonic2.png");
    }else if(peli.getCodigo().equals("animales3")){
    peli.setFotografia("/ExamenlDylanMolina/images/animales3.png");
    }
    fotografia=peli.getFotografia();
    return fotografia;
    }
}