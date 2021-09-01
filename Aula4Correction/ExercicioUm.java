/*
 *Exer01
Faça um algoritmo que solicite que o usuário digite seu nome e a 
seguir digite a sua idade. Depois que o usuário digitar o 
nome e a idade, o programa deverá exibir na tela duas mensagens: uma com o nome e 
outra com a idade do usuário. Suponha que o usuário seja o Pedro e tenha 32 anos. 
Assim, após a digitação dos dados, seu programa deverá exibir as seguintes mensagens: 
“Seu nome é Pedro”
 “Você tem 32 anos
 */

import java.util.Scanner;

public class ExercicioUm {
    //atributos - variáveis - texto e número inteiro
    String nome;
    int idade;
    //instância da classe Scanner 
    //neste programa o Scanner vai ser chamado de "ler"
    static Scanner ler = new Scanner(System.in);

    
    public static void main(String[] args) {
        //print da tela do texto "Digite o seu nome: "
        System.out.println("Digite o seu nome: ");
        //configurando a classe scanner para ler o próximo texto
        String nome = ler.next();
        //print da tela do texto "Digite a idade da pessoa: "
        System.out.println("Digite a idade da pessoa: ");
        //configurando a classe scanner para ler o próximo dado inteiro
        int idade = ler.nextInt();
        
        System.out.println("********************************************");
        System.out.println("Se nome é: " + nome);
        System.out.println("Você tem: " + idade + "  anos");
        
    }
    
}