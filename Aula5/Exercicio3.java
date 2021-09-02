
/**
 * Faça um programa que leia uma variável real "A" digitada pelo usuário e apresente o resultado dos seguintes cálculos:
 o dobro de "A"
 o triplo do dobro de "A"
 a metade do triplo do dobro de "A"
 o quadrado da variável "A" - Math.pow(número, potência);
 a quinta parte do dobro de "A"
 */

import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) {
        
        double a;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor para a variável A: ");
        a = ler.nextDouble();
        
        //o dobro de "A"
        System.out.println("O dobro de A é: " + (a * 2));
        
        //o triplo do dobro de "A"
        System.out.println("O triplo do dobro de A é: " + (a * 2) * 3);
        
        //a metade do triplo do dobro de "A"
        System.out.println("A metade do triplo do dobro de A é: " + ((a * 2) * 3) / 2);
        
        //o quadrado da variável "A" - Math.pow(número, potência);
        System.out.println("O quadrado da variável A é: " + Math.pow(a, 2));
        
        //a quinta parte do dobro de "A"
        System.out.println("A quinta parte do dobro de A é: " + (a * 2) / 5);
    }
    
}
