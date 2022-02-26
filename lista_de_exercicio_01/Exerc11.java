/*
* Faça um algoritmo que mostre o novo preço de um produto sabendo-se que este terá um desconto de 15%, mostrando também a classificação do produto segundo o as informações abaixo.
Novo preço: de 500 para cima = CARO
Abaixo de 500 = BARATO
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double produtoDesconto = ler.nextDouble();

        if ((produtoDesconto - (produtoDesconto*0.15)) > 500) {
            System.out.print("Este produto está caro");
        } else if ((produtoDesconto - (produtoDesconto*0.15)) < 500) {
            System.out.print("Este produto está barato");
        }
    }
}
