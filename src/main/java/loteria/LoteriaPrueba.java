/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

/**
 *
 * @author Enrique
 */
public class LoteriaPrueba {

    public static void main(String[] args) {
        System.out.println("Creamos la loteria");
        Loteria L1 = new Loteria();

        System.out.println("Rellenamos la loteria con sus valores y su premio");
        L1.rellenarLoteria();
        System.out.println("");

        System.out.println("Comprobamos el número de boletos en la loteria");
        System.out.println(L1.saberNumElementos());
        System.out.println("");

        System.out.println("Buscamos el premio del boleto 00001");
        System.out.println("El premio del boleto es " + L1.consultarBoleto("00000"));
        System.out.println("");
        System.out.println("Buscamos el premio del boleto 00999");
        System.out.println("El premio del boleto es " + L1.consultarBoleto("00999"));

    }
}
