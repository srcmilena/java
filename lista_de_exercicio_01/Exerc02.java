/*
* Escreva um algoritmo para ler o seu nome e sua idade e escreva como saída Bem-vindo!! “nome digitado”, você tem “idade digitada”.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Oi! Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.print("Agora, a sua idade: ");
        idade = ler.nextInt();

        System.out.print("Seja bem-vinda(o), " + nome + "! Você tem " + idade + " anos de idade.");

    }
}
