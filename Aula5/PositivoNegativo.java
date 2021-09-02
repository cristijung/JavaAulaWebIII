
/**
Crie um programa que leia um 
número digitado e retorne se o mesmo é positivo ou negativo
 */

import java.util.Scanner;

public class PositivoNegativo 
{
    public static void main(String[] args) {
        
        int num;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número desejado: ");
        num = ler.nextInt();
        
        if (num < 0) {
            System.out.println("O número é negativo");
                      
        }else{
            System.out.println("O número é positivo");
        }
    }
    
}
