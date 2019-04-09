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
public class Punto {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calcularDistancia(Punto p) {
        int distancia = 0;
        distancia = (int)Math.sqrt(Math.pow((this.x - p.x), 2 + Math.pow((this.y - p.y), 2)));
        return distancia;
    }

}
