/*
3) Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 +
bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao
usuário nas seguintes situações:

a. Se o usuário informar o valor de A igual a zero. a equação não e do segundo grau e o
programa não deve fazer pedir os demais valores, sendo encerrado;

b. Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e
encerre o programa;

c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe ao
usuário;

d. Se o delta for positivo, a equação possui duas raízes reais; informe-as ao usuário;
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0, b = 0, c = 0, delta = 0;
        float res, res2;
        do {
            System.out.println("Digite o valor de A");
            a = ler.nextInt();
            if (a == 0) {
                System.out.println("Quando A é igual à 0 a equação não é de segundo grau");
                break;
            } else {
                System.out.println("Digite o valor de B");
                b = ler.nextInt();
                System.out.println("Digite o valor de C");
                c = ler.nextInt();
                delta = (int) (Math.pow(b, 2)) - (4 * a * c);
                System.out.println("Delta = " + delta);
                if (delta < 0) {
                    System.out.println("A equação não possui raízes reais, pois o delta é negativo.");
                    break;
                } else if (delta == 0) {
                    System.out.println("A equação possui apenas uma raiz real, pois o valor de delta é zero.");
                    res = (float) (-(b) / (2 * a));
                    System.out.println("O valor da expressão " + a + "x2 " + " + " + b + " x + " + c + "\n" + "x = " + res);
                } else {
                    System.out.println("A expressão possui duas raízes reais, pois delta é maior que 0");
                    res = (float) ((-(b) + Math.sqrt(delta)) / (2 * a));
                    res2 = (float) ((-(b) - Math.sqrt(delta)) / (2 * a));
                    System.out.println("Os valores da expressão " + a + "x2 " + " + " + b + " x + " + c + "\n" + "x1 = " + res + " | x2 = " + res2);
                    break;
                }
            }
        } while (a != 0);
    }
}
