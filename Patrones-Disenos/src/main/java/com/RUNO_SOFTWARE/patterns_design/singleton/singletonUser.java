/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RUNO_SOFTWARE.patterns_design.singleton;

/**
 *
 * @author Rodrigo Vidal
 * 
 * una clase de la estructura basica del patron singleton,
 * mas detalles en la clase singletonMain.
 */
public class singletonUser {

    /**
     * variable estatica de la clase
     */
    private static  singletonUser userSingleton ;
    
    /**
     * contructor privado para evitar las instacias y solo ser usado en la misma  clase,
     * con la finallidad de crear  una sola instacia  a traves de un metodo publico 
     */
    private  singletonUser() {
    }
    
    /**
     * metodo que llamare donde lo necesite  una instancia de esta clase.
     * si existe  una instacia , la rerorna  a quien lo llamo.
     * sino existe  una instancia (userSingleton == null), entonces procedemos a crear la 
     * instacia 
     * @return  instancia de la clase 
     */
    public  static singletonUser getIntanceUser(){
        if(userSingleton == null){
            userSingleton = new singletonUser();
        }
        return userSingleton;
    }
    
    
    public void mensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    
    
}
