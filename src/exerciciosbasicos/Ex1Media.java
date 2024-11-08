package exerciciosbasicos;

import java.util.Scanner;

/*
 * Exercício 1:
 * Calcular a média de 3 notas.
 */

public class Ex1Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a nota 1");
        nota1 = scan.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = scan.nextDouble();
        System.out.println("Digite a nota 3");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("media = %f", media);

        scan.close();
    }
}