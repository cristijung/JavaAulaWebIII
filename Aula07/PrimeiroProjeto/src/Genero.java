// Elabore um algoritmo que leia do teclado o sexo de uma pessoa.  
//Se o sexo digitado for M ou F, escrever na tela “Sexo Masculino ou Feminino!”.  
//Caso contrário, informar “Terceiro Sexo!”.

import java.util.Scanner;

public class Genero {
    public static void main(String[] args) {
        String genero;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o gênero da pessoa: ");
        genero = ler.nextLine();

        if(genero == "f") {
            System.out.println("O gênero da pessoa é Feminino");
        }else if (genero == "m"){
            System.out.println("O gênero da pessoa é Masculino");
        }else{
            System.out.println("O gênero da pessoa é alternativo");
        }


       
    }
}
