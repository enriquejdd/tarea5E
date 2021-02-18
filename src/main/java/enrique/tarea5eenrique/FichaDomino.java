/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tarea5eenrique;

import java.util.Random;

/**
 *
 * @author Enrique
 */
public class FichaDomino {
    // Atributos

    private int valorSup;
    private int valorInf;

    // Constructor parametrizado
    public FichaDomino(int valorSup, int valorInf) {
        this.valorSup = valorSup;
        this.valorInf = valorInf;

        // Si el valor esta fuera del rango
        if (valorSup > 6 || valorSup < 0) {
            if (valorSup % 2 == 0) {
                this.valorSup = 6; // Si es par
            } else {
                this.valorSup = 5; // Si es impar
            }
        }

        // Si el valor esta fuera del rango permitido
        if (valorInf > 6 || valorInf < 0) {
            if (valorInf % 2 == 0) {
                this.valorInf = 6; // Si es par
            } else {
                this.valorInf = 5; // Si es impar
            }
        }
    }

    // Constructor por defecto
    public FichaDomino() {
        this.valorSup = 0;
        this.valorInf = 0;
    }

    // Getteres y setteres
    public int getValorSup() {
        return valorSup;
    }

    public void setValorSup(int valorSup) {
        // Si el valor esta fuera del rango
        if (valorSup > 6 || valorSup < 0) {
            if (valorSup % 2 == 0) {
                this.valorSup = 6; // Si es par
            } else {
                this.valorSup = 5; // Si es impar
            }
        }
        this.valorSup = valorSup;
    }

    public int getValorInf() {
        return valorInf;
    }

    public void setValorInf(int valorInf) {
        // Si el valor esta fuera del rango permitido
        if (valorInf > 6 || valorInf < 0) {
            if (valorInf % 2 == 0) {
                this.valorInf = 6; // Si es par
            } else {
                this.valorInf = 5; // Si es impar
            }
        }
        this.valorInf = valorInf;
    }

    @Override
    public String toString() {
        if (valorInf == 0 && valorSup == 0) {
            return "[ | ]";
        } else if (valorInf == 0) {
            return "[" + valorSup + "| ]";
        } else if (valorSup == 0) {
            return "[ |" + valorInf + "]";
        }
        return "[" + valorSup + "|" + valorInf + ']';
    }

    public byte getValorTotal(int valorSup, int valorInf) {
        byte b1 = (byte) ((byte) valorInf + valorSup);
        return b1;
    }

    // Genera fichas aleatorias
    public static FichaDomino generaFichaAleatoria() {
        Random aleatorio = new Random();
        FichaDomino fal = new FichaDomino(); // Creamos una nueva ficha la cual será la que obtenga los valores aleatorios

        fal.valorInf = aleatorio.nextInt(7);
        fal.valorSup = aleatorio.nextInt(7);
        return fal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.valorSup;
        hash = 89 * hash + this.valorInf;
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
        final FichaDomino other = (FichaDomino) obj;
        if (this.valorSup != other.valorSup) {
            return false;
        }
        if (this.valorInf != other.valorInf) {
            return false;
        }
        return true;
    }
    
    

}
