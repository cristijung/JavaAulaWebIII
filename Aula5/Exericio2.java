/**
 Faça um programa que leia três valores inteiros digitados pelo usuário 
 e retorne o resultado da multiplicação desses valores.
 */
import java.util.Scanner;
public class Exericio2
{
   public static void main(String[] args) {
       
       int n1,n2,n3;
       
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Digite o primeiro número: " );
       n1 = ler.nextInt();
       
       System.out.println("Digite o segundo número: " );
       n2 = ler.nextInt();
       
       System.out.println("Digite o terceiro número: " );
       n3 = ler.nextInt();
       
       System.out.println("O valor da multiplicacão dos três números é: " + n1 * n2 * n3);
   }
}
