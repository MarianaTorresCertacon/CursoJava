package variaveisPrimitivas;

public class tiposPrimitivos {
    public static void main(String[] args) {
        //Caracteres Characters
        char primeiraLetraNome = 'M';
        char primeiraLetraNomeASCII = 77;

        System.out.println(primeiraLetraNome);
        System.out.println(primeiraLetraNomeASCII);

        //Inteiros Integer
        byte nota = 10; 
        short itens = 2;
        int quantEstoque = 2366;
        long numeroMuitoGrande = 55555555L;
        System.out.println("nota = " + nota);
        System.out.println("itens = " + itens);
        System.out.println("quantidade em estoque = " + quantEstoque);
        System.out.println("número muito grande = " + numeroMuitoGrande);;

        //Decimais
        float peso = 1.5f;
        double preco = 24.99;
        System.out.println("peso = "+ peso);
        System.out.println("preço = " + preco);
    
        //Booleanos ou Boolean
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("boolean = " + verdadeiro + " ou " + falso);
    }
}
