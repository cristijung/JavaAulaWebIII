
/**
 Faça um algoritmo que solicite que o usuário digite 
 seu nome e a seguir solicite que seja digitada sua idade. 
 Depois que o usuário digitar o nome e a idade, o programa 
 deve exibir na tela duas mensagens: uma com o nome e outra 
 com a idade do usuário. Suponha que o usuário seja o Pedro e tenha 32 anos. 
 Assim, após a digitação dos dados, seu programa deve exibir as seguintes mensagens: 
“Seu nome é Pedro”
 “Você tem 32 anos”
 */

import java.util.Scanner;

public class Exercicio1
{
    String nome;
    int idade;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        System.out.println("******************************");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Você tem: " + idade + " anos");
    }
    
}




