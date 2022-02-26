/*
* Uma agência bancária possui dois tipos de investimentos, conforme o quadro abaixo. Faça um algoritmo que receba o tipo do investimento e o valor do investimento, calcule e mostre o valor corrigido de acordo com o tipo de investimento.
Tipo - 1 Poupança - 5%
Tipo - 2 Fundo de renda fixa - 10%
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite 1 para poupança ou 2 para fundo de renda fixa: ");
        int tipo = ler.nextInt();

        System.out.print("Agora, digite o valor: ");
        double valor = ler.nextDouble();

        if (tipo == 1) {
            System.out.print("O valor corrigido é: " + (valor+(valor*0.05)));
        } else if (tipo == 2) {
            System.out.print("O valor corrigido é: " + (valor+(valor*0.1)));
        }
    }
}
