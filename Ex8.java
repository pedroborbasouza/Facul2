/*
8) Escreva um algoritmo que leia cinco valores inteiros e diferentes e mostre-os em ordem
crescente.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n[] = new int[5];
        int aux;
        for (int i = 0; i < n.length; i++) {
            System.out.println("Escreva o " + (i + 1) + "º número.");
            n[i] = ler.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = (i + 1); j < n.length; j++) {
                if (n[j] < n[i]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (i == 4) {
                System.out.println(n[i] + ".");
            } else {
                System.out.print(n[i]+" | ");
            }
        }
    }
}
