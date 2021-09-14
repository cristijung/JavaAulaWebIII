// Do while = Faça enquanto

import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num, soma = 0;
        int cont = 0;
        /*
        Faça a execução do bloco de println + a condição If enquanto o usuário
        não digitar um número abaixo de zero
        "cont ++" é o incremento que será usado para armazenar a quantidade de números
        q foram digitados até q o programa parou
        */
        do {
            System.out.println("Digite um número: ");
            num = ler.nextDouble();

            if(num >= 0) {
                soma = num + soma;
                cont ++;
            }

        }
        //o while tem a condição de verificar se o num digitado for maior ou igual a zero, no 
        //momento em que o user digitar fora da condição, o while obtém o valor da soma e 
        //divide pela quantidade de números digitados
        while(num >= 0);
        System.out.println("A média dos números inseridos é: " + soma / cont);
    }    
}
