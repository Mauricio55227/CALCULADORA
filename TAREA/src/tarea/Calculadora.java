/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author BLANQUET
 */
public class Calculadora {
    private int n1;
    private int n2;


    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int sumar() {

        int a = this.n1 + this.n2;

        return a;

    }

    public int restar() {

        int b = this.n1 - this.n2;

        return b;

    }

    public int multiplicar() {

        int c = this.n1 * this.n2;

        return c;

    }

    public int dividir() {

        int d = this.n1 / this.n2;

        return d;
    }
}

