/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucionejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ResolucionEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RESOLUCION DE EJERCICIOS PLANTEADOS EN CLASE PARA SUBIR A GIT
        /*
        //EJERCICIO 1
        //Programa para el cálculo de promedio: Solicitar tres calificaciones, calcular el promedio aritmético y mostrarlo..
        double nota1=0;
        double nota2=0;
        double nota3=0;
        double promedio=0;
        
        System.out.println("====Bienvenido al programa para calcular el promedio=====");
        
        
        nota1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera nota."));
        nota2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda nota."));
        nota3=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera nota"));
        
        promedio = (nota1+nota2+nota3)/3;
        System.out.println("El promedio de las 3 calificaciones es: " + promedio);
        
        //EJERCICIO 2 
        //Edad de la madre al dar a luz: Calcular la diferencia de edad entre una madre y su hijo dadas ambas edades.
        
        
        int edadMadre=0;
        int edadHijo=0;
        int diferenciaEdad=0;
        
        System.out.println("===Bienvenido al programa para calcular la diferencia de edad entre una madre y su hijo===");
        
        edadMadre=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la Madre"));
        edadHijo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del hijo"));
        
        diferenciaEdad=edadMadre-edadHijo;
        
        System.out.println("La diferencia de edad es de: " + diferenciaEdad + " años");
        
        //EJERCICIO 3 
        //Conversión de unidades: Convertir pesos colombianos a dólares.
        
        
        System.out.println("===Bienvenido a la calculadora de conversion de pesos colombianos a dolares===");
        double valorPesosColombianosActual=3301.50;
        double valorPesosColombianos=0;
        double valorDolares = 0;
        
        valorPesosColombianos=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de pesos colombianos que desea convertir a dólares"));
        
        valorDolares=valorPesosColombianos/valorPesosColombianosActual;
        
        System.out.println("El valor en dólares es de: $" + valorDolares + " dólares");
        
        //EJERCICIO 4
        //Cálculo del Área y perímetro de un círculo:
        System.out.println("===Bienvenido a la calculadora de area y perimetro de un circulo===");
        
        double radio=0;
        double pi=3.14159;
        double area=0;
        double perimetro;
        
        radio=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo porfavor"));
        area=pi*(radio*radio);
        perimetro=2*pi*radio;
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);
        
        
        //EJERCICIO 5
        //Cálculo del área y perímetro de un rombo:
        
        double diagonalMayor=0;
        double diagonalMenor=0;
        double ladoRombo=0;
        double areaRombo=0;
        double perimetroRombo=0;        
        
        diagonalMayor=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la diagonal mayor"));
        diagonalMenor=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de la diagonal menor"));
        ladoRombo=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un lado del rombo"));
        
        areaRombo=(diagonalMayor*diagonalMenor)/2;
        perimetroRombo=4*ladoRombo;
        
        System.out.println("El area del rombo es: " + areaRombo);
        System.out.println("El perimetro del rombo es: " + perimetroRombo);
        
        System.out.println("Gracias");
        
        */
        
        
        //Ejercicio 6 
        //Encontrar el numero mayor y menor digitado de una persona
        
        int primerNumero=0;
        int segundoNumero=0;
        
        System.out.println("Bienvenido al programa para calcular cual es el numero mayor");
        primerNumero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        segundoNumero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        
        
        if (primerNumero>segundoNumero) {
            System.out.println("El primer  numero es mayor");
        } else if (segundoNumero>primerNumero){
            System.out.println("El segundo numero es mayor");
        }else {System.out.println("Los numeros son iguales");
    }
    }
    
}
