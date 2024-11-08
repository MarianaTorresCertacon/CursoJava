package exerciciosbasicos;

import java.util.Scanner;

public class Ex3Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um número");
        num = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        scan.close();
    }
}
