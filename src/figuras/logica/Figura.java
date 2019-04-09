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
public abstract class Figura {

    protected Punto origen;
    protected Punto fin;
    protected int area;
    protected int perimetro;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getFin() {
        return fin;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

}
