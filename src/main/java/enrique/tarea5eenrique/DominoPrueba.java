/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tarea5eenrique;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Enrique
 */
public class DominoPrueba {

    public static void main(String[] args) {
        
        Domino d1 = new Domino();
        System.out.println("¿Cuántas fichas tiene el domino d1? " + d1.saberNumFichas());
        System.out.println("");
        d1.imprimir();

        System.out.println("Creamos la ficha fd1");
        FichaDomino fd1 = new FichaDomino(5, 6);
        System.out.println(fd1);
        System.out.println("");
        d1.introducirFicha(fd1);

        System.out.println("Creamos la ficha fd2");
        FichaDomino fd2 = new FichaDomino(0, 0);
        System.out.println(fd2);
        System.out.println("");
        System.out.println("Tiene el domino la ficha " + fd2 + " " + d1.fichaCreada(fd2));
        System.out.println("");
        System.out.println("Borramos dicha ficha " );
        d1.eliminarFicha(fd2);
        
        System.out.println("Creamos un nuevo domino");
        System.out.println("");
        Domino d2 = new Domino();
        System.out.println("Pero, ¿está vacio el domino? " + d2.tieneFichas());
        
        for (FichaDomino ficha : d2.vaciar()) {
            System.out.println(ficha);
        }
        
        ArrayList<FichaDomino> lista = new ArrayList<>();
        
        lista = d1.vaciar();

    }
}
