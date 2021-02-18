/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Enrique
 */
public class Loteria {

    private Map<String, Integer> loterias;

    public Loteria() {
        this.loterias = new HashMap<>();
    }

    public Map<String, Integer> getLoterias() {
        return loterias;
    }

    public void setLoterias(Map<String, Integer> loterias) {
        this.loterias = loterias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.loterias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Loteria other = (Loteria) obj;
        if (!Objects.equals(this.loterias, other.loterias)) {
            return false;
        }
        return true;
    }

    public void imprimir() {
        for (int i = 0; i < loterias.size(); i++) {
            System.out.println("Boleto " + loterias.keySet() + " con premio " + loterias.values());
        }
        System.out.println("");
    }

    public void guardarBoleto(String boleto, Integer premio) {
        loterias.put(boleto, premio);
    }

    public void rellenarLoteria() {
        Random ale = new Random();
        int num = 0; // Creamos el num inicial a 0
//        Formatter fmt = new Formatter(); // Formateador del texto
        String dato = ""; // String inicial

        for (int i = 0; i < 1000; i++) {
            int premio = ale.nextInt(500);
//            fmt.format("%05d", num); // Le damos formato al num
//            dato = fmt.toString(); // Añadimos el num al string vacio
//            fmt.format("%05d", num); // Le damos formato al num
            dato = String.format("%05d", num);

            // Creamos un nuevo String el cual cogerá solo los últimos 5 caracteres de dato lo cual será el siguiente numero ha añadir.
//            String ult = dato.substring(dato.length() - 5, dato.length());
//            guardarBoleto(ult, premio);
            guardarBoleto(dato, premio); // Lo añadimos a loterias
            num++; // Aumentamos en 1 el valor de num
            dato = "";
        }
    }

    public int consultarBoleto(String boleto) {
        int premio = 0;

        for (String key : loterias.keySet()) {
            if (key.equals(boleto)) {
                premio = loterias.get(key);
                return premio;
            } else {

            }
        }

        return premio;
    }

    public int saberNumElementos() {
        return loterias.size();
    }

}
