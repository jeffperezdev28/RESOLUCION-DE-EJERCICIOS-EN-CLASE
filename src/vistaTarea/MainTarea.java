/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaTarea;

import modeloTarea.Calificacion;
import modeloTarea.Persona;

/**
 *
 * @author ASUS
 */
public class MainTarea {    
    /*
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
    */
    public static void main(String[] args) {
        
        System.out.println ("===Bienvenido al programa para calcular la diferencia de edad de una madre y su hijo===");
        
        //CREAR O INSTANCIAR OBJETOS USANDO EL CONSTRUCTOR VACIO
        Persona madre=new Persona();
        madre.edad= 42;
        madre.cedula="1004768915";
        madre.rol="Madre";
        
       //USANDO EL CONSTRUCTOR CON ARGUMENTOS
       
       Persona hijo=new Persona(25, "1004768915","hijo");
       
       double diferenciaEdad = madre.edad - hijo.edad;
       
        System.out.println("La diferencia de edad entre hijo y madre es de: " + diferenciaEdad);
        
        
        
        
        
    }
}
