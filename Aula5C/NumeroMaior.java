
/**
 *Faça um algoritmo que leia um valor inteiro e informe se este valor é maior do que 10 ou não.
 *Usando If/esle
 */

import java.util.Scanner;

public class NumeroMaior{    
    
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        
        System.out.println("Digite um valor de 0 a 100: ");
        num = ler.nextInt();
        System.out.println("O valor digitado foi: " + num);
        
        
        if (num > 10) {
            System.out.print("O número digitado é maior igual a 10");
        }else{
            System.out.print("O número digitado é menor do que 10");
        }
              
        
        
    }
}
