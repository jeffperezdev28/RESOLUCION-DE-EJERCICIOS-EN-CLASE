/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaTarea;

import modeloTarea.Calificacion;

/**
 *
 * @author ASUS
 */
public class MainTarea {    
    public static void main(String[] args) {
        System.out.println("===Bienvenido al programa para calcular el promedio ===");
              
        
        Calificacion calificacion1=new Calificacion();
        calificacion1.idCalificacion=211;
        calificacion1.nota="Diez";
        calificacion1.valor=10;
        
        
    //USANDO EL CONSTRUCTOR CON ARGUMENTOS
    Calificacion calificacion2=new Calificacion(212,"Ocho",8);
    
    //USANDO EL CONTRUCTOR CON ARGUMENTOS
    
    Calificacion calificacion3=new Calificacion(213,"Siete",7);
    
    double promedio =(calificacion1.valor+calificacion2.valor+calificacion3.valor)/3;
    
    System.out.println("El promedio de las calificaciones es de: " + promedio);
    
    
    }
    
}
