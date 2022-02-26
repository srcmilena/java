/*
* Escreva um algoritmo para ler um valor e escrever o seu antecessor.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");
        valor = ler.nextInt();

        System.out.print("O valor é: " + valor + " e o antecessor desse valor é: " + (valor - 1));

    }
}
