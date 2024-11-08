package exerciciosbasicos;

import java.util.Scanner;

/*
 * Ler dois números e imprimir a relação entre eles.
 * (Igual, maior, menor, maior ou igual, etc)
 */

public class Ex4Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        num2 = scan.nextInt();

        System.out.println(num1 + " = " + num2 + "? " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + "? " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + "? " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + "? " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + "? " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + "? " + (num1 <= num2));

        scan.close();
    }
}
