/*
* Faça um algoritmo que leia um valor de um produto e mostre um novo valor deste produto atualizado, para o novo valor deverá ser concedido o desconto de 25%.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double produto;

        System.out.print("Digite o valor do produto: ");
        produto = ler.nextDouble();

        System.out.print("O valor do produto com desconto é: " + (produto - (produto*0.25)));

    }
}
