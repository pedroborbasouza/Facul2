/*
5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
imprimindo o resultado.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex5  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n;
        System.out.println("Digite um numero");
        n = ler.nextFloat();
        if (n > 0) {
            n = n * 2;
        } else {
            n = n * 3;
        }
        System.out.println("O resultado deu "+n);
    }
}