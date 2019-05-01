/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Validador.Validador;

/**
 *
 * @author gilio
 */
public class Jugar {

    Validador val = new Validador();

    int ganar = 7;

    Dados d = new Dados();

    public void lanzar() {
        if (ganar == d.getResultado()) {
            System.out.println("El resultado es " + d.getResultado());
            System.out.println("Felicidades, haz ganado.");
        } else {
            System.out.println("El resultado es " + d.getResultado());
            System.out.println("Haz perdido, intenta denuevo.");
            deNuevo();
        }

    }

    public void deNuevo() {

        System.out.println("¿Quiere jugar de nuevo?");
        System.out.println();
        System.out.println("1.- Sí");
        System.out.println("2.- No");

        int respuesta = val.validaNumero();

        switch (respuesta) {
            case 1:
                lanzar();
                deNuevo();
                break;
            case 2:
                System.out.println("Adiós");
                System.exit(0);
                break;
            default:
                deNuevo();

        }
    }

}
