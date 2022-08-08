/*
12) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno
nas 3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
aproveitamento, usando a fórmula:
MA:= ((nota1 + nota 2 )* 2 +( nota 3) * 3 + (ME)) /7
A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do
aluno, suas notas, a média dos exercícios, a média de aproveitamento, o conceito
correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o
conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E.
 */
package Facul.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12  {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float n1, n2, n3, me, ma;
        int id;
        String nota = null;
        System.out.println("Escreva seu número de identifiação");
        id = ler.nextInt();
        System.out.println("Escreva a 1º nota");
        n1 = ler.nextFloat();
        System.out.println("Escreva a 2º nota");
        n2 = ler.nextFloat();
        System.out.println("Escreva a 3º nota");
        n3 = ler.nextFloat();
        me = (float) ((n1 + n2 + n3)/3);
        ma = (float) (((n1+n2)*2+(n3*3)+me)/7);
        if (ma >= 90) {
            nota = "A";
        } else if (ma >= 75 && ma < 90) {
            nota = "B";
        } else if (ma >= 60 && ma < 75) {
            nota = "C";
        } else if (ma >= 40 && ma < 60) {
            nota = "D";
        } else if (ma < 40) {
            nota = "E";
        }
        System.out.println("As notas do aluno "+id+ " foram:"+"\n"+"Nota 1: "+n1+" | Nota 2: "+n2+" | Nota 3: "+n3);
        System.out.println("A média dos exercícios foi de: "+df.format(me));
        System.out.println("A média da de aproveitamento foi de: "+df.format(ma)+" gerando o conceito "+nota);
    }
}

