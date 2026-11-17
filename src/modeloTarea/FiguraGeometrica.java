/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTarea;

/**
 *
 * @author ASUS
 */
public class FiguraGeometrica {
    
    public int radio;
    public double diagonalMayor;
    public double diagonalMenor;
    public double ladoRombo;
    
    //CONSTRUCTOR VACIO
    public FiguraGeometrica(){}
    
    
    //CONSTRUCTOR CON ARGUMENTOS
    
    public FiguraGeometrica(int radio, double diagonalMayor, double diagonalMenor, double ladoRombo){
        this.radio=radio;
        this.diagonalMayor=diagonalMayor;
        this.diagonalMenor=diagonalMenor;
        this.ladoRombo=ladoRombo;
    }
    
    
}
