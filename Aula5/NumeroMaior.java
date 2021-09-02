
import java.util.Scanner;

public class NumeroMaior
{
    public static void main(String[] args) {
        int valor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor desejado: ");
        valor = ler.nextInt();
        
        /*
         * Faça um algoritmo que leia um valor inteiro e informe se este valor é 
         * igual maior do que 10 ou não.
         */
        if (valor >= 10) {
            System.out.println("O número digitado é maior ou igual a 10!");
        }else{
            System.out.println("O número digitado é menor do que 10!");
        }
        
    }
}
