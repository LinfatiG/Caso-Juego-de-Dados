/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Validador {

    public int validaNumero() {
        int num = 0;
        boolean error;

        do {

            try {
                error = false;
                Scanner teclado = new Scanner(System.in);
                num = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es numerico, intentelo de nuevo");
                error = true;
            }

        } while (error);

        return num;
    }

}
