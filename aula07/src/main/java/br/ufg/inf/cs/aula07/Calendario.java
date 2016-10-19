/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.cs.aula07;

import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Shakaw
 */
public class Calendario {

    public static void main(String[] args) {
        int resultado;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a data sem espaços ou barras, formato: "
                + "anomesdia");
        int num = leitor.nextInt();

        System.out.println("Digite ano bissexto");
        int bissexto = leitor.nextInt();

        System.out.println("digite a data conhecida");
        int conhecida = leitor.nextInt();

        resultado = diaDaSemana(ano(num), mes(num), dia(num));

        System.out.println(resultado);

    }

    public static int ano(int num) {
        int a;

        a = num / 10000;

        return a;
    }

    public static int mes(int num) {
        int m, x;

        x = num % 10000;
        m = x / 100;

        return m;

    }

    public static int dia(int num) {
        int d, x, y;
        x = num % 10000;
        d = x % 100;
     
        return d;
    }

    public static int diaDaSemana(int a, int m, int d) {
        if (d < 1 || d > 31) {
            return -1;
        }

        if (m < 1 || m > 12) {
            return -1;
        }

        if (a < 1753) {
            return -1;
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

        return s % 7;
    }

}
