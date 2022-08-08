/*
11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o
preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a
seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%.
 */
package Facul.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float produto, preco;
        String op = "";
        int parcela = 0;
        String op2 = "";
        System.out.println("Qual o preço do produto?");
        produto = ler.nextFloat();
        System.out.println("Qual a forma de pagamento?");
        while (!op.equals("sair")) {
            op = ler.next();
            op = op.toLowerCase();
            if (op.equals("cheque") || op.equals("dinheiro")) {
                preco = (float) (produto - produto * 0.1);
                System.out.println("O valor total com 10% de deconto ficou R$" + df.format(preco));
                break;
            } else if (op.equals("crédito") || op.equals("cartão") || op.equals("cartão de crédito")) {
                do  {
                    System.out.println("Como vai fazer o pagamento?" + "\n" + "A - À vista" + "\n" + "P - À prazo" + "\n"
                            + "S - SAIR");
                    op2 = ler.next();
                    op2 = op2.toLowerCase();
                    if (op2.equals("a")) {
                        preco = (float) (produto - (produto * 0.15));
                        System.out.println("O valor total com desconto de 15% ficou R$" + df.format(preco));
                        break;
                    } else if (op2.equals("p")) {
                        do {
                            System.out.println("Em quantas vezes pretende parcelar?");
                            parcela = ler.nextInt();
                            if (parcela < 2) {
                                System.out.println(
                                        "Número de parcelas inválida. só é possível parcelar no mínimo duas vezes");
                            } else if (parcela == 2) {
                                preco = produto;
                                System.out.println("O total ficou R$" + df.format(preco));
                                preco = produto / 2;
                                System.out.println("Feito em 2x de R$" + df.format(preco));
                            } else {
                                preco = (float) (produto + (produto * 0.1));
                                System.out.println("O total com acréscimo de 10% ficou R$" + df.format(preco));
                                preco = (float) (preco / parcela);
                                System.out.println("Feito em " + parcela + "x de R$" + df.format(preco));
                            }
                        } while (parcela < 2);
                        break;}
                } while (!op2.equals("s"));
                break;
            } else if (op.equals("sair")) {
                System.out.println("Você optou por sair do programa.");
            }
        }
    }
}
