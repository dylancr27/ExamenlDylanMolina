/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarteleraController;

import cinema.logic.pelicula;

/**
 *
 * @author ESCIINF
 */
public class model {
 pelicula objeto1;
    
    
    
    public model(){
    objeto1= new pelicula("","","","","","",0,0);
    
    }
    
    public pelicula getObjeto1(){
    return objeto1;
    }
    
    public void setObjeto1(pelicula objeto1){
    this.objeto1=objeto1;}
    
    public String establecerFoto(pelicula peli){
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