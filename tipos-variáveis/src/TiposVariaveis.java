public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    // no tipo "double" o ponto "." não serve para represntear milhar em java
    // para milhar escreva por extenso 
        String salarioMinimo = "2500 " +"2.500";

    // fortemente tipado sem a palavra "short"
    // o codigo daria erro pois "numeroNormal"
    // pode ser maior que 32000 conbinaçoes oque excede 
    //o osnumeros curtos! 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

     //   valor constate use a palavra "final" 
     //   no inicio do codigo que não quer que seja auterado
     int numero = 5;
     numero = 10;
     System.out.print(numero);

     final double VALOR_DE_PI = 3.14;
     VALOR_DE_PI = 10;

     

    }
}
