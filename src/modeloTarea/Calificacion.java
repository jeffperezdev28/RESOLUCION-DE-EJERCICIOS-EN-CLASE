/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTarea;

/**
 *
 * @author ASUS
 */
public class Calificacion {
    public int idCalificacion;
    public String nota; 
    public double valor;
    
    //CONSTRUCTOR VACIO
    
    public Calificacion() {}
    
    //CONSTRUCTOR CON ARGUMENTOS

    public Calificacion(int idCalificacion, String nota, double valor) {
        this.idCalificacion = idCalificacion;
        this.nota = nota;
        this.valor = valor;
    }
    
    
    
}
