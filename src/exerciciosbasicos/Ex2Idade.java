package exerciciosbasicos;

import java.util.Scanner;

/*
 * Ler idade em anos e imprimir em dias.
 * 
 * ex: 1 ano -> 365 dias de idade.
 */

public class Ex2Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anos, dias;

        System.out.println("digite a sua idade");
        anos = scan.nextInt();

        dias = anos * 365;
        System.out.printf("Você tem %d dias de idade", dias);

        scan.close();
    }
}