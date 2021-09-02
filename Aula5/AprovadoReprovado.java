
/**
 Digitar o nome do aluno
 Sua nota 
 Retornar se está aprovado ou reprovado
 */

import java.util.Scanner;

public class AprovadoReprovado
{
    public static void main (String[] args) {
        String nome;
        double media;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();        
        System.out.println("Digite a média do aluno: ");
        media = ler.nextDouble();
        
        if (media >= 7) {
            System.out.println("O aluno está APROVADO");

        }else {
            System.out.println("O aluno está REPROVADO");
        }
                
    }
}
