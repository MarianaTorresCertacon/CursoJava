package operadores;

public class operadoresJava {
    public static void main(String[] args) {
        //Operadores Aritméticos
        int n1 = 1;
        int n2 = 2;
        int adicao = n1+n2;
        System.out.println(adicao);

        int n3 = 3;
        int n4 = 4;
        int subtracao = n4 -n3;
        System.out.println(subtracao);

        int n5 = 5;
        int n6 = 6;
        int multiplicacao = n5 * n6;
        System.out.println(multiplicacao);

        int n7 = 7;
        int n70 = 70;
        int divisao = n70 / n7;
        System.out.println(divisao);

        int n71 = 71;
        int modulo = n71 % n7;
        System.out.println(modulo);

        int contador = 0;
        contador++;
        contador++;

        contador--;
        System.out.println(contador);

        //Operadores Relacionais
        double d1 = 1.0;
        double d2 = 2.0;
        boolean maior = d2>d1;
        System.out.println("é maior = " + maior);

        boolean menor = d1<d2;
        System.out.println("é menor = " + menor);

        System.out.println(d1>=d1);

        boolean igual = d2 == d2;
        System.out.println(igual);

        boolean diferente = d2 != d2;
        System.out.println(diferente);

        //Operadores de Atribuição
        int v = 1;
        v += 4;
        v -=4;
        v *= 4;
        v /= 4;
        v %= 4;
        System.out.println(v);

        //Operadores Lógicos
        int valor1 = 2;
        int valor2 = 4;
        boolean expressaoAnd = valor1 < 10 && valor2 < 10;
        System.out.println(expressaoAnd);

        boolean expressaoOr = valor1 < 10 && valor2 < 10;
        System.out.println(expressaoOr);

        boolean expressaoNot = !(2<1);
        System.out.println(expressaoNot);
    }
}
