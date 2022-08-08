/*
7) Faça um algoritmo que leia uma variável e some 5, caso seja par ou some 8, caso seja ímpar,
imprimir o resultado desta operação.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex7  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n;
        System.out.println("Digite um número");
        n = ler.nextFloat();
        if (n % 2 == 0) {
            n = n+5;
        } else {
            n = n+8;
        }
        System.out.println("N = "+n);
    }
}
