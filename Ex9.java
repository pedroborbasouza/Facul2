/*
9) Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
calcule seu peso ideal, utilizando as seguintes fórmulas:

● para homens: (72.7 * h) – 58;
● para mulheres: (62.1 * h) – 44.7.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex9 {
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
