/*
1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
que C.
 */
package Facul.Lista2;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Escreva o valor de A: ");
        a = scanner.nextInt();
        System.out.println("Escreva o valor de B: ");
        b = scanner.nextInt();
        System.out.println("Escreva o valor de C: ");
        c = scanner.nextInt();
        d = (a+b) ;
        if (d > c){
            System.out.println(a+b);
        }
    }
}
