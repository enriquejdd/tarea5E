/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author enrique
 */
public class Traductor {

    private Map<String, String> traductorEspIng;

    public Traductor() {
        this.traductorEspIng = new HashMap<>();
    }

    public Map<String, String> getTraductorEspIng() {
        return traductorEspIng;
    }

    public void setTraductorEspIng(Map<String, String> traductorEspIng) {
        this.traductorEspIng = traductorEspIng;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.traductorEspIng);
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
        final Traductor other = (Traductor) obj;
        if (!Objects.equals(this.traductorEspIng, other.traductorEspIng)) {
            return false;
        }
        return true;
    }

    public void imprimir() {        
        for (String key : traductorEspIng.keySet()) {
            System.out.printf("%s -- %s %n", key, traductorEspIng.get(key));
        }
        System.out.println("");
    }

    public void guardarTraduccion(String palabraIngles, String palabraEspañol) {
        traductorEspIng.put(palabraIngles, palabraEspañol);
    }

    public void borrarTraduccion(String palabraIngles) {
        if (traductorEspIng.containsKey(palabraIngles)) {
            traductorEspIng.remove(palabraIngles);

        }
    }

    public void modificarTraduccion(String palabraIngles, String palabraEspañol) {
        if (traductorEspIng.containsKey(palabraIngles)) {
            traductorEspIng.put(palabraIngles, palabraEspañol);
        }
    }

    public ArrayList crearListaIngles() {
        ArrayList<String> listaIngles = new ArrayList<>(traductorEspIng.keySet());
//        for (String key : traductorEspIng.keySet()) {
//            listaIngles.add(key);
//        }

        return listaIngles;

    }

    public ArrayList crearListaCastellano() {
        ArrayList<String> listaCastellano = new ArrayList<>();
        for (String key : traductorEspIng.keySet()) {
            listaCastellano.add(traductorEspIng.get(key));
        }

        return listaCastellano;
    }

    public int saberNumElementos() {
        return traductorEspIng.size();
    }

}
