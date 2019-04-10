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
public class Elipse extends Figura{
    
    public void calcularArea(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int radio1= temp.calcularDistancia(fin);
        int radio2= origen.calcularDistancia(temp);
        area = (int) Math.PI * radio1 * radio2;
    }
    
    public void calcularPerimetro(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int radio1 = temp.calcularDistancia(fin);
        int radio2 = origen.calcularDistancia(temp);
        perimetro = (int) (2*Math.PI)*(int)(Math.sqrt((Math.pow(radio1,2)+Math.pow(radio2,2))/2));
    }
}
