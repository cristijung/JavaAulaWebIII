
/**
 * Retornar valor Par ou Ímpar
 */

import java.util.Scanner;

public class ParImpar
{
    public static void main(String[] args) {
        int num;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        num = ler.nextInt();
        
        if ((num % 2) == 0) {
            System.out.println("O número digitado é Par!");
        }else{
            System.out.println("O número digitado é Ímpar!");
        }
        
    
    }
}
