/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Enrique
 */
public class TraductorPrueba {

    public static void main(String[] args) {
        Traductor t = new Traductor();

        t.guardarTraduccion("Curious", "Curioso");
        t.guardarTraduccion("Beach", "Playa");
        t.guardarTraduccion("Table", "Mesa");
        t.guardarTraduccion("Dog", "Perro");
        t.guardarTraduccion("Orange", "Naranja");
        t.guardarTraduccion("Pencil", "Lapiz");
        t.guardarTraduccion("Keyboard", "Teclado");
        t.guardarTraduccion("Announcement", "Anuncio");
        t.guardarTraduccion("Mosque", "Mezquita");
        t.guardarTraduccion("Ankle", "Tobillo");

        System.out.println("Número de elementos en el traductor " + t.saberNumElementos());
        t.imprimir();

        t.borrarTraduccion("Ankle");
        System.out.println("Número de elementos en el traductor " + t.saberNumElementos());
        t.imprimir();

        t.modificarTraduccion("Curious", "Curioso/a");
        System.out.println("Cambiamos la traducción de 'Curious'");
        t.imprimir();

        System.out.println("Creamos la lista con las palabras en ingles");
        ArrayList<String> listaI = t.crearListaIngles();

        System.out.println("La lista debe de quedar así:");
        for (int i = 0; i < listaI.size(); i++) {
            System.out.println(i + " " + listaI.get(i));
        }
        System.out.println("");

        System.out.println("Creamos la lista con las palabras en castellano");
        ArrayList<String> listaC = t.crearListaCastellano();

        System.out.println("La lista debe de quedar así:");
        for (int i = 0; i < listaC.size(); i++) {
            System.out.println(i + " " + listaC.get(i));
        }

    }
}
