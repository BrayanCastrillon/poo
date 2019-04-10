/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura {
    //(private float radio;
    //private final float pi = (float) 3.1416
    
    public void calcularArea() {
        float radio = origen.calcularDistancia(fin);
        area = (int) (Math.PI*Math.pow(radio,2));
    }

    public void calcularPerimetro() {
       int radio = origen.calcularDistancia(fin);
       perimetro = (int) (2*Math.PI*radio);
    }
}
