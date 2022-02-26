/*
* Uma empresa decide dar um aumento de 30% aos funcionários com salários inferiores a R$ 500,00. Faça um algoritmo que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem caso o funcionário não tenha direito ao aumento.
*/

package lista_de_exercicio_01;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu sálario: ");
        double salario = ler.nextDouble();

        if (salario <= 500) {
            System.out.print("O seu novo salário é: " + (salario + (salario*0.30)));
        } else if (salario >= 500) {
            System.out.print("Você não tem acesso a esse beneficio.");
        }
    }
}
