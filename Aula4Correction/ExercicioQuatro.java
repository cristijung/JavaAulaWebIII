
/*
 * Exer04
Crie um programa que leia o nome e os valores digitados de duas notas de 
um aluno e calcule a sua média de acordo com a fórmula abaixo:
Media = nota1 + nota2 multiplicado por 2 e dividido por 3.

 */
 

import java.util.Scanner;
public class ExercicioQuatro
{
    String nome;
    double n1,n2;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.next();
        
        System.out.println("Digite a N1 do aluno: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite a N2 do aluno: ");
        double n2 = ler.nextDouble();
        
        System.out.println("A média do aluno: " + n1 + (n2 * 2) / 3);
        
    }
    
}
