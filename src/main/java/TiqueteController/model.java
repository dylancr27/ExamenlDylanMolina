/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiqueteController;

import cinema.logic.compra;




/**
 *
 * @author ESCIINF
 */
public class model {
    compra objeto1;
    
    
    
    public model(){
    objeto1= new compra(0,0,"","","","");
    
    }
    
    public compra getObjeto1(){
    return objeto1;
    }
    
    public void setObjeto1(compra objeto1){
    this.objeto1=objeto1;}
}

