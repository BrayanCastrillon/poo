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
public class Cuadrado extends Figura {

    

    public void calcularArea() {
        int lado = origen.calcularDistancia(fin);
        area = lado * lado;
    }

    public void calcularPerimetro() {
        int lado = origen.calcularDistancia(fin);
        perimetro = 4 * lado;
    }
}
