package exerciciosbasicos;

import java.io.Console;

public class Ex8Console {
    public static void main(String[] args) {
        Console console = System.console();
        
        System.out.println("digite seu nome completo");
        String nome = console.readLine();

        System.out.println("Olá, " + nome);
    }
}
