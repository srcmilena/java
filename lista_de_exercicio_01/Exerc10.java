/*
* Uma Empresa de vendas de softwares paga a seu vendedor um fixo de R$ 1200,00 por mês, mais uma comissão de 15% pelo seu valor de vendas no mês. Faça um algoritmo que leia o valor da venda e determine o salário total do funcionário. Mostre as informações que você achar necessário.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double venda;

        System.out.print("Digite o valor da venda: ");
        venda = ler.nextDouble();

        System.out.print("O seu salário + a venda será: " + (venda+(venda*0.15)));

    }
}
