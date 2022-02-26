/*
* Faça um algoritmo que receba o valor do salário de um funcionário, o número de dependentes deste funcionário e a quantidade de horas extras trabalhadas. Calcule e mostre o salário bruto a receber do funcionário seguindo as regras abaixo.
• para cada dependente acrescentar 120 reais;
• para cada hora extra trabalhada calcular o valor da hora trabalhada acrescida de 50%, para achar o valor da hora normal o salário deve ser dividido por 220 que é total mensal de horas trabalhadas por um trabalhador.
• o salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas extras
*/

package lista_de_exercicio_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.print("Digite o salário do funcionário: ");
        double salario = ler.nextInt();

        double valorHora = (salario/220);

        System.out.print("Digite o número de dependentes: ");
        int nDependentes = ler.nextInt();

        int dependentes = (nDependentes*120);

        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horasExtras = ler.nextInt();

        if (nDependentes >= 1) {
            System.out.println("O valor referente aos dependentes é: " + dependentes);
        }

        if (horasExtras >= 1) {
            System.out.println("O valor das horas extras é: " + decimal.format(horasExtras*valorHora));
        }

        double salarioBruto = (salario + dependentes + (horasExtras*valorHora));

        System.out.println("O seu salário bruto será no valor de: " + decimal.format(salarioBruto));
    }
}
