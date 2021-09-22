/*
ARRAYLIST
Faça um programa que receba somente numeros positivos e exiba e calcule:
- o número digitado;
- a soma dos números digitados;
- a quantidade de números digitados;
- calcule e média dos ns digitados
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //declaração e criação do ArrayList
        ArrayList<Integer> ListNumDigitados = new ArrayList<>();

        System.out.println("Digite a quantidade de números desejados: ");
        System.out.println("Para finalizar o programa, digite qualquer número negativo:");
        
        int num = 0;

        do {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            ListNumDigitados.add(num);
        }while(num > 0);
        int ultimoNum = ListNumDigitados.size();
        ListNumDigitados.remove(ultimoNum - 1);

        System.out.println("Esta é a lista de números digitados " + ListNumDigitados);
    }

    
}
