/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RUNO_SOFTWARE.patterns_design.singleton;

/**
 *
 * @author Rodrigo Vidal
 * Reseña del patrón singleton 
 * 
 *El patrón  singleton intenta resolver la instanciación excesiva 
 * de objetos de una misma clase .
 * 
 * Una desventaja es que en este patrón, almenos en su forma básica, 
 * el objeto singleton opera de forma síncrona, lo cuál puede ser perjudicial 
 * si nuestro software requiere de concurrencia de llamados a métodos de este objeto.
 * 
 * Pero por otro lado este patrón es bastante útil si, por ejemplo, queremos asegurar que
 * la conexión entre capas de software sea realizada por un único objeto, o si este objeto 
 * singleton es muy pesado en memoria y tener múltiples instancias de este genera un gran 
 * gasto de recursos 
 */

public class singletonMain {
    public static void main(String[] args) {
        
        singletonUser usuarioSingleton = singletonUser.getIntanceUser();
        usuarioSingleton.mensaje("Saludos Programador@s");
    }
    
}
