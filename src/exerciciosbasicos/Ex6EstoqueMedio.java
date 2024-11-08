package exerciciosbasicos;

import java.util.Scanner;

/*
 * Calcular estoque médio de uma peça.
 * quant minima + quant maxima / 2
 */

public class Ex6EstoqueMedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min, max, mediaEstoque;

        System.out.println("digite a quantidade mínima do estoque");
        min = scan.nextInt();
        System.out.println("digite a quantidade máxima do estoque");
        max = scan.nextInt();

        mediaEstoque = (min + max) / 2;
        System.out.printf("QuantMinima = %d, QuantMaxima = %d, media do estoque = %d unidades", min, max, mediaEstoque);

        scan.close();
    }
}
