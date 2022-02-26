/*
* Considerando que para um consórcio, sabe-se o número total de prestações, a quantidade de prestações pagas e o valor atual da prestação, escreva um algoritmo que determine o total pago pelo consorciado e o saldo devedor.
*/

package lista_de_exercicio_01;

import java.text.DecimalFormat;

public class Exerc08 {
    public static void main(String[] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        int prestacoesTotal = 250;
        int prestacoesPagas = 100;
        double prestacoesValor = 150.20;
        double totalPago = (prestacoesPagas*prestacoesValor);
        double saldoDevedor = ((prestacoesTotal - prestacoesPagas) * prestacoesValor);

        System.out.println("O total pago é: " + decimal.format(totalPago));
        System.out.print("O saldo devedor é: " + decimal.format(saldoDevedor));
    }
}
