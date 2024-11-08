package exerciciosbasicos;

import java.util.Scanner;

/*
 * Converter o valor de dólar para reais.
 */

public class Ex7Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dolar, reais, cotacao;

        System.out.println("digite um valor em dólares");
        dolar = scan.nextDouble();

        System.out.println("digite a cotação do dolar");
        cotacao = scan.nextDouble();

        reais = dolar * cotacao;
        System.out.printf("$%.2f com a cotação a R$%.2f = R$%.2f ", dolar, cotacao, reais);

        scan.close();
    }
}
