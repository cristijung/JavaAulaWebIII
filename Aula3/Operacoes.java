
public class Operacoes{
    
    public static void main (String[] args) {
        //dois atributos int (inteiros) com valores atribuidos
        int num1 = 24;
        int num2 = 56;
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double restoDivisao = num2 % num1;
        
        System.out.println("O resultato da soma dos números é? " + soma);
        System.out.println("O resultado da subtracão dos números é? " + subtracao);
        System.out.println("O resultado da multiplicacão dos números é? " + multiplicacao);
        System.out.println("O resultado da divisão dos números é? " + divisao);
        System.out.println("O resultado do resto da divisão dos números é? " + restoDivisao);
        
    }
}