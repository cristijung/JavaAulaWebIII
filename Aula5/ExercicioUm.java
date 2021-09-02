import java.util.Scanner;

public class ExercicioUm
{
    
    public static void main(String[] args) {
        String nome;
        int idade;
    
        Scanner ler = new Scanner(System.in);    
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("******************************");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Você tem: " + idade + " anos");
    }
    
}