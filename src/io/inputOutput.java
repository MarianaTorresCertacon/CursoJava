package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no java.
 * 
 * Entrada de dados: Ler dados do usuário.
 *  Saída de dados: Escrever dados para o usuário.
 */

public class inputOutput {
    public static void main(String[] args) {
        //Leitura de dados de entrada
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        System.out.println(valor);
        in.close();

        //Saída de dados
        System.out.printf("O número digitado foi %d", valor);

        float valor2 = 3.0f;
        System.out.printf("\nO número digitado foi %f", valor2);
    }
}
