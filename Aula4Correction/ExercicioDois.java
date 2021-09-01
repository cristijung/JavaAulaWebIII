/*
 * Exer02
Faça um programa que leia três valores inteiros digitados pelo 
usuário e retorne o resultado da multiplicação desses valores.
 */
import java.util.Scanner;

public class ExercicioDois
{
   int n1,n2,n3;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o primeiro número: ");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = ler.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = ler.nextInt();
        
        System.out.println("O valor da multiplicação dos três números é: " + n1*n2*n3);
    }
}
