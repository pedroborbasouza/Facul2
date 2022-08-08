/*
15) Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o
triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
− Triângulo Retângulo: possui um ângulo reto. (igual a 90o);
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o);
− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o).
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex15  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a1, a2, a3;
        System.out.println("Escreva o 1º ângulo: ");
        a1 = ler.nextInt();
        System.out.println("Escreva o 2º ângulo: ");
        a2 = ler.nextInt();
        System.out.println("Escreva o 3º ângulo: ");
        a3 = ler.nextInt();
        if (a1+a2+a3 < 180 && a1+a2+a3 > 180 && a1 < 0 && a2 < 0 && a3 < 0) {
            System.out.println("Valores inválidos");
        } else {
            if (a1 < 90 && a2 < 90 && a3 < 90) {
                System.out.println("Trata-se de um triângulo acutângulo.");
            } else if (a1 == 90 && a2 == 90 && a3 == 90) {
                System.out.println("Trata-se de um triângulo retângulo.");
            } else {
                System.out.println("Trata-se de um triângulo obtusângulo ");
            }
        }
    }
}