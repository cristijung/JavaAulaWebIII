/**
 * digitar a nota e a frequencia do aluno.o aluno para obter aprovação ele precisa ter média igual ou superior a 6 E frequencia de 75%
 * 
 */
import java.util.Scanner;
public class Nota{
    public static void main(String[] args) {
        double media;
        int frequencia;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite a media do aluno");
        media = ler.nextDouble();
        System.out.println("digite a frequencia do aluno");
        frequencia = ler.nextInt();
        
        if((media>=6)&& (frequencia >= 75)) {
            System.out.println("o aluno está APROVADO");
        }else{
            System.out.println("o aluno está REPROVADO");
        }
        }
    }
