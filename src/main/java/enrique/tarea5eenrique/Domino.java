/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tarea5eenrique;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Enrique
 */
public class Domino {

    private Set<FichaDomino> d;
    private final int numTotalFichas = 28;

    // El constructor debe inicializar la estructura y poner las fichas en ella (no hay fichas duplicadas y el orden no importa).
    public Domino() {
        this.d = new HashSet<>();
        int numS = 6;
        int numI = 6;
        for (int i = 0; i < numTotalFichas; i++) {
            this.d.add(new FichaDomino(numS, numI));
            numI--;

            if (numI == 0) {
                numI = 6;
                numS--;
            }
        }

        numS = 6;
        numI = 6;
    }

    public Set<FichaDomino> getD() {
        return d;
    }

    public void setD() {
        this.d = d;
    }
    
    public void imprimir(){
        for (FichaDomino fichaDomino : d) {
            System.out.println(fichaDomino);
        }
    }

    // 1. Saber el número de fichas que tiene.
    public int saberNumFichas() {
        return d.size();
    }

    // 2. Introducir una ficha.
    public void introducirFicha(FichaDomino e) {
        if (e.getValorSup() < 7 && e.getValorSup() >= 0 && e.getValorInf() < 7 && e.getValorInf() >= 0) {
            d.add(new FichaDomino(e.getValorSup(), e.getValorInf()));
        }
    }

    // 3. Saber si hay fichas dentro.
    public boolean tieneFichas() {
        return d.isEmpty();
    }

    // 4. Saber si una ficha está en el conjunto.
    public boolean fichaCreada(FichaDomino e) {
        return d.contains(e);
    }

    // 5. Sacar todas las fichas, en forma de ArrayList.
    public ArrayList<FichaDomino> vaciar() {
        ArrayList<FichaDomino> DomArra = new ArrayList<>(d);
        d.clear();
//        for (FichaDomino fichaDomino : d) {
//            DomArra.add(fichaDomino);
//        }
        return DomArra;
    }

    //5. Eliminar una ficha concreta.
    public void eliminarFicha(FichaDomino e) {
        if (!d.contains(e)) {
            d.remove(e);
        }

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.d);
        hash = 41 * hash + this.numTotalFichas;
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
        final Domino other = (Domino) obj;
        if (this.numTotalFichas != other.numTotalFichas) {
            return false;
        }
        if (!Objects.equals(this.d, other.d)) {
            return false;
        }
        return true;
    }

}
