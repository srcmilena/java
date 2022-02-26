/*
* Ler 2 números, efetuar as 4 operações matemática (adição, subtração, multiplicação e divisão), mostrar o resultado de cada operação.
*/
package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();

        System.out.println("A soma é: " + (num1 + num2));
        System.out.println("A divisão é: " + (num1 / num2));
        System.out.println("A subtração é: " + (num1 - num2));
        System.out.println("A multiplicação é: " + (num1 * num2));

    }
}
