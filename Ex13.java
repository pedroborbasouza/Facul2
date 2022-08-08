/*
13) Escreva um programa para ler o número de lados de um polígono regular e a medida do
lado (em cm). Calcular e imprimir o seguinte:
− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
− Se o número de lados for igual a 5 escrever PENTÁGONO.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex13  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado;
        float medida;
        System.out.println("Quantos lados tem o polígono?");
        lado = ler.nextInt();
        System.out.println("Qual a medida de seu lado?");
        medida = ler.nextFloat();
        if (lado == 3) {
            System.out.println("Trata-se de um triângulo.");
            System.out.println("Área = "+medida+" cm2");
        } else if (lado == 4) {
            System.out.println("Trata-se de um quadrado");
            System.out.println("Área = "+medida+" cm2");
        } else if (lado == 5) {
            System.out.println("Trata-se de um pentágono.");
        }
    }
}