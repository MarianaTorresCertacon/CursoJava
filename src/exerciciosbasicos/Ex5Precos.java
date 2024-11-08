package exerciciosbasicos;

import java.util.Scanner;

/*
 * Ler o preço de um produto;
 * Ler a % de desconto;
 * Imprimir o preço com desconto e o valor economizado.
 */

public class Ex5Precos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preco, desconto, novoValor, valorEconomizado;

        System.out.println("digite o preço do produto");
        preco = scan.nextDouble();
        System.out.println("digite a % de desconto");
        desconto = scan.nextDouble();

        valorEconomizado = (preco * desconto) / 100;
        novoValor = preco - valorEconomizado;

        System.out.println("R$" + preco + " com " + desconto + "% de desconto = R$" + novoValor);
        System.out.println("O valor economizado foi R$" + valorEconomizado);

        scan.close();
    }
}
