//Do while = faça enquanto
//O programa deverá armazenar os números pares ou ímpares e retornar a soma
//somente dos números pares digitados e a soma somente dos números 
//ímpares digitados

import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int somaPares = 0;
        int somaImpares = 0;

        do {
            System.out.println("Digite um valor: ");
            numero = ler.nextInt();
            contador ++;

            if(numero % 2 == 0) {
                System.out.println("Este número é par!");
                somaPares ++;
            }else {
                System.out.println("Este número é ímpar!");
                somaImpares ++;
            }
        }
        while (contador + 1 <= 10);
        System.out.println("Números pares inseridos: " + somaPares);
        System.out.println("Números ímpares inseridos: " + somaImpares);
    }
    
}
