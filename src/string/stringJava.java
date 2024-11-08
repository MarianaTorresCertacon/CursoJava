package string;

import java.util.Scanner;

public class stringJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = in.nextLine();
        System.out.println("Olá, " + nome);

        in.close();
    }
}
