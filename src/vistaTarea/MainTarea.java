/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistaTarea;

import modeloTarea.Calificacion;
import modeloTarea.FiguraGeometrica;
import modeloTarea.Persona;
import modeloTarea.Moneda;
import modeloTarea.FiguraGeometrica;

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
    
    /*
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
        
    */   
   /*
    public static void main(String[] args) {
        System.out.println("===Bienvenido al programa para calcular la tasa de cambio de pesos colombianos a dolares===");
        //CREAR O INSTANCIAR OBJETOS USANDO EL CONSTRUCTOR VACIO
        
        Moneda valorPesosColombianosActual=new Moneda();
        valorPesosColombianosActual.tipoMoneda="Peso colombiano";
        valorPesosColombianosActual.tasaCambio=3301.50;
        valorPesosColombianosActual.pais="Colombia";
        
        
        
        Moneda valorPesosColombianos=new Moneda("Peso colombiano", 40000,"Colombia");
        
        double valorDolaresConvertido = valorPesosColombianos.tasaCambio/valorPesosColombianosActual.tasaCambio;
        
        System.out.println("El valor en dólares es de: " + valorDolaresConvertido);
        
    }
    */
    public static void main(String[] args) {
        System.out.println("===Bienvenido al programa para calcular el perimetro y area de un ciruclo===");
        
        FiguraGeometrica longitudRadio1=new FiguraGeometrica();
        longitudRadio1.radio=23;
        
        double pi=3.14159;
        
        double areaCirculo1= pi*(longitudRadio1.radio*longitudRadio1.radio);
        double perimetroCirculo1=2*pi*longitudRadio1.radio;
        
        System.out.println("El área del circulo 1 es: " + areaCirculo1);
        System.out.println("El perimetro del circulo 1 es: " + perimetroCirculo1);
        
        
        FiguraGeometrica longitudRadio2=new FiguraGeometrica(15);
        
        double areaCirculo2= pi*(longitudRadio2.radio*longitudRadio2.radio);
        double perimetroCirculo2=2*pi*longitudRadio2.radio;
        
        System.out.println("El área del circulo 2 es: " + areaCirculo2);
        System.out.println("El perimetro del circulo 2 es: " + perimetroCirculo2);
        
        
        
    }
        
        
    }
}
