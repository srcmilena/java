/*
* Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever "Financiamento Concedido"; senão, escreverá "Financiamento Negado". Independente de conceder ou não o financiamento, o algoritmo escreverá a frase "Obrigado por nos consultar."
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        double salario = ler.nextDouble();

        System.out.print("Agora, digite o valor do financiamento pretendido: ");
        double financiamento = ler.nextDouble();

        if (financiamento <= (salario*5)) {
            System.out.println("Financiamento concedido.");
        } else {
            System.out.println("Financiamento negado.");
        }

        System.out.print("Obrigado por nos consultar.");
    }
}
