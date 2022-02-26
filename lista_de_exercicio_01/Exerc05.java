/*
* Fazer um algoritmo que leia o nome de uma pessoa o ano de nascimento e o ano atual, e mostre quantos anos essa pessoa tem.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        int anoNascimento, anoAtual;

        System.out.print("Oi! Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.print("Agora, o ano atual: ");
        anoAtual = ler.nextInt();

        System.out.print("Por fim, sua data de nascimento: ");
        anoNascimento = ler.nextInt();

        System.out.print(nome + " a sua idade é: " + (anoAtual-anoNascimento));

    }
}
