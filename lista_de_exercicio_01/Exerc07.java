/*
* Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto levou para percorrê-la (em horas). O programa deve calcular a velocidade média em km/h, e exibir a seguinte frase: A velocidade média de XX foi YY km/h.—Onde XX é o nome do piloto, e YY é sua velocidade média.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        double distancia, tempo;

        System.out.print("Digite o nome do piloto: ");
        nome = ler.nextLine();

        System.out.print("Digite a distância percorrida: ");
        distancia = ler.nextDouble();

        System.out.print("Digite a duração da viagem (em horas): ");
        tempo = ler.nextDouble();

        System.out.print("A velocidade média do piloto " + nome + " foi: " + (distancia/tempo));

    }
}
