
/**
 * Exer03
Faça um programa que leia uma variável real "A" digitada pelo usuário e 
apresente o resultado dos seguintes cálculos:
 o dobro de "A"
 o triplo do dobro de "A"
 a metade do triplo do dobro de "A"
 o quadrado da variável "A" - Math.pow(número, potência);
 a quinta parte do dobro de "A"

 */

import java.util.Scanner;

public class ExercicioTres
{
   double a;
    
    static Scanner ler = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println("Digite o valor da variável A: ");
        double a = ler.nextDouble();
        
        System.out.println("O dobro de A é: " + (a * 2));
        System.out.println("O triplo do dobro de A é:" + (a * 2) * 3);
        System.out.println("A metade do triplo do dobro de A é: " + ((a * 2) * 3) / 2 );
        System.out.println("O quadrado da variável A é: " + Math.pow(a, 2));
        System.out.println("A quinta parte do dobro de A é: " + (a * 2) / 5);
}
}
