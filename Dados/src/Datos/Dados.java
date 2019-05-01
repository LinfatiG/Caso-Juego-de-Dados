/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author gilio
 */
public class Dados {

    private int dado1 = (int) (Math.random() * 6) + 1;
    private int dado2 = (int) (Math.random() * 6) + 1;
    private int resultado = dado1 + dado2;

    Dados(int dado1, int dado2, int resultado) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.resultado = resultado;
    }

    Dados() {

    }

    public int getDado1() {
        return dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public int getResultado() {
        return resultado;
    }

}
