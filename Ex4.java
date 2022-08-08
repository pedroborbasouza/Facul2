/*
4) Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-
se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex4  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float a,b;
        double c;
        System.out.println("Digite o valor a");
        a = ler.nextFloat();
        System.out.println("Digite o valor b");
        b = ler.nextFloat();
        if (a == b) {
            c = a+b;
        } else {
            c = a*b;
        }
        System.out.println("C = "+c);
    }
}

