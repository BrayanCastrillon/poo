/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.logica.Cuadrado;
import figuras.logica.Figura;
import figuras.logica.Punto;
import figuras.logica.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Seleccione la figura:");
        System.out.println("1. cuadrado");
        System.out.println("2. rectangulo");
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();
        Figura f;
        Punto origen = new Punto();
        Punto fin = new Punto();
        switch (opc) {
            case 1:
                f = new Cuadrado();
                origen.setX(0);
                origen.setY(0);

                fin.setX(5);
                fin.setY(0);
                mostrar(f, origen, fin);

                break;

            case 2:
                f = new Rectangulo();
                origen.setX(0);
                origen.setY(5);

                fin.setX(10);
                fin.setY(0);
                mostrar(f, origen, fin);

                break;

            default:
                System.out.println("Opción no válida.");
        }

    }

    public static void mostrar(Figura f, Punto origen, Punto fin) {
        f.setOrigen(origen);
        f.setFin(fin);
        f.calcularArea();
        f.calcularPerimetro();
        System.out.println("Area= " + f.getArea());
        System.out.println("Perímetro= " + f.getPerimetro());

    }

}
