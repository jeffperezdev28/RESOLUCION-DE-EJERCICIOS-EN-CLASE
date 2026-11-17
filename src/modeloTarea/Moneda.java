/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTarea;

/**
 *
 * @author ASUS
 */
public class Moneda {
    public String tipoMoneda;
    public double tasaCambio;
    public String pais;
   
   //CONSTRUCTOR VACIO
   public Moneda (){};
   
   //CONSTRUCTOR CON ARGUMENTOS
   
   public Moneda( String tipoMoneda, double tasaCambio, String pais){
       this.tipoMoneda=tipoMoneda;
       this.tasaCambio=tasaCambio;
       this.pais=pais;
       
       
   }
   
    
}
