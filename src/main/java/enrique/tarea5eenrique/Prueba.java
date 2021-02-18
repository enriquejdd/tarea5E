/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tarea5eenrique;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Prueba {
    // Creamos un método que pregunte por el valor superior de la ficha

    public static int leer() {
        Scanner teclado = new Scanner(System.in);
        int valorSuperior = 0;
        do {
            System.out.println("¿Qué valores es el desea?");
            try {
                valorSuperior = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
            }
        } while (valorSuperior < 0 || valorSuperior > 7);
        return valorSuperior;
    }

    // Método para saber si la ficha es un seis dobles.
    public static boolean dobleseis(FichaDomino ficha) {
        if (ficha != null) {
            return (ficha.getValorSup() == 6 && ficha.getValorInf() == 6);
        }
        return false;

    }

    public static void main(String[] args) {
        // Creamos las fichas f1 y f2
        System.out.println("Ficha f1");
        FichaDomino f1 = new FichaDomino(leer(), leer());
        System.out.println("");
        System.out.println("Ficha f2");
        FichaDomino f2 = new FichaDomino(leer(), leer());
        System.out.println("");

        // Mostramos las fichas f1 y f2
        System.out.println("Ficha f1");
        System.out.println(f1.toString());
        System.out.println("");
        System.out.println("Ficha f2");
        System.out.println(f2.toString());
        System.out.println("");

        // Creamos la ficha 3 con valores erroneos y lo mostramos
        System.out.println("Ficha f3");
        FichaDomino f3 = new FichaDomino(7, 8);
        System.out.println(f3.toString());

        // Creamos la ficha sin valores
        FichaDomino f4 = new FichaDomino();
        System.out.println("Ficha f4");
        System.out.println(f4.toString());
        System.out.println("");

        // Modificamos los valores de f4
        System.out.println("Ficha f4");
        f4.setValorInf(2);
        f4.setValorSup(4);
        System.out.println(f4.toString());
        System.out.println("");

        // Le cambiamos a un valor aleatorio
        System.out.println(FichaDomino.generaFichaAleatoria());
        System.out.println("");

        int contador = 0;
        FichaDomino f5 = new FichaDomino();
        do {
            f5 = FichaDomino.generaFichaAleatoria();
            f5.getValorTotal(f5.getValorSup(), f5.getValorInf());
            System.out.println("El valor de la ficha es: " + f5.toString());
            System.out.println("Y tiene un valor total de: " + f5.getValorTotal(f5.getValorSup(), f5.getValorInf()));
            System.out.println("");
            contador++;
        } while (!dobleseis(f5));

        System.out.println("Se ha tardado en obtener la ficha seis dobles " + contador + " intentos");
    }
}
