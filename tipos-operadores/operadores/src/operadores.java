public class operadores {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String nome = "Samir_Campos_Lima";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao =false;
       // Date dataNascimento = new Date();

    //operadores matematicos soma(+),subtração(-),multiplicação(*),divisão(/) e modulo(%)
    // opredaor de adição(+) usado en string serve para concatenar as strings
    // determine sempre o que vai querere como soma
          System.out.print("1"+(1+1));// saida:12
    // pq se colocar uma string no meio das somas o java identificara tudo como string
          System.out.print("1"+1+1); //saida: 111


          //classe Operadores.java
      String nomeCompleto = "LINGUAGEM" + "JAVA";
		
      //qual o resultado das expressoes abaixo?
    String concatenacao ="?"; 

      concatenacao = 1+1+1+"1";

      concatenacao = 1+"1"+1+1;

      concatenacao = 1+"1"+1+"1";

      concatenacao = "1"+1+1+1;

      concatenacao = "1"+(1+1+1);

    //trocando o valor do sinal  
    int numero = 5;
    numero = - numero; //saida:-5
    numero = - numero;//saida:5
    System.out.println(numero);//saida:5

//classe Operadores.java
 int numero4 = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println("valor");

//classe Operadores.java
int numero1 = 1;
int numero2 = 2;

if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");

if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2");

if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2");

if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2");

if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2");

    }
    // ComparacaoAvancada.java

public static void original(String[] args) {

    String nome1 = "JAVA";
    String nome2 = "JAVA";
    
    System.out.println(nome1 == nome2); //true

    String nome3 = new String("JAVA");
    
    System.out.println(nome1 == nome3); //false

    String nome4 = nome3;

    System.out.println(nome3 == nome4); //true
    
    //equals na parada
    System.out.println(nome1.equals(nome2)); //??
    System.out.println(nome2.equals(nome3)); //??
    System.out.println(nome3.equals(nome4)); //??

     }

    //no caso de objetos use  "equals" pois ele verifica conteudo e os compara 
    public static void origin(String[] args) {

    int numero1 = 130;
    int numero2 = 130;
    System.out.println(numero1 == numero2); //true
    
    Integer numero3 = 130;
    Integer numero4 = 130;

    System.out.println(numero3 == numero4); //false
    
    // A razão pela qual o resultado é false, é devido o Java tratar os valores
    // Como objetos a partir de agora.
    // Qual a solução ?
    // Quando queremos comparar objetos, usamos o método equals
    
     System.out.println(numero3.equals(numero4)); 
    
    // Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
System.out.print("Um dos valores precisa ser verdadeiro");

}


}
