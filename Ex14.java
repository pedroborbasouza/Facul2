/*
14) Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
 */
package Facul.Lista2;

import java.util.Scanner;

public class Ex14  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado;
        float medida;
        System.out.println("Quantos lados tem o polígono?");
        lado = ler.nextInt();
        if (lado < 3) {
            System.out.println("Não é um polígono");
            System.exit(0);
        } else  if (lado > 5){
            System.out.println("Polígono não identificado");
            System.exit(0);
        } else if (lado == 5) {
            System.out.println("Trata-se de um pentágono.");
            System.exit(0);
        }
        System.out.println("Qual a medida de seu lado?");
        medida = ler.nextFloat();
        if (lado == 3) {
            System.out.println("Trata-se de um triângulo.");
            System.out.println("Área = "+medida+" cm2");
        } else if (lado == 4) {
            System.out.println("Trata-se de um quadrado");
            System.out.println("Área = "+medida+" cm2");
        }
    }
}
