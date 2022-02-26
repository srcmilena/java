/*
* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double carro;

        System.out.print("Digite o valor do carro: ");
        carro = ler.nextDouble();

        System.out.print("O valor do carro é: " + (carro + (carro*0.28) + (carro*0.45)));

    }
}
