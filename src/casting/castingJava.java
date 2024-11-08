package casting;
/*
 * Casting: Operaçaõ de transformar um tipo de dado em outro.
 * 
 * Widening Casting x Narrowing Casting
 */
public class castingJava {
    public static void main(String[] args) {
        //Widening Casting (Implicito)
        byte valorPequeno =1;
        int valorGrande = valorPequeno;
        System.out.println(valorGrande);

        //Narrowing Casting (Explícito)
        long vLong = 66273826388L;
        int vInt = (int)vLong;
        System.out.println(vInt);

        //Divisão de Números Inteiros
        int n1 = 2;
        int n2 = 9;
        float resultado = (float) n2 / n1;
        System.out.println(resultado);

    }
}
