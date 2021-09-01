/**
 * Criar um algoritmo que o usuário digite um valor solicitado e o programa resolva:
 * - Exibir o valor;
 * - Mostrar o dobro deste valor;
 * - Mostrar o triplo da metade do dobro deste valor;
 * - Mostrar a divisão por 4 deste valor
 */

//import a classe Scanner
import java.util.Scanner;

public class Matematica {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        
        double valor;
        
        System.out.println("Digite um valor: " + "\n" + "Valor digitado: ");
        valor = ler.nextDouble();
        
        System.out.println("O Dobro do valor é: " + (valor * 2));
        System.out.println("O triplo da metade do dobro deste valor: " + ((valor * 2) * 3) / 2);
        System.out.println("A divisão por 4 deste valor é: " + (valor / 4));
    }
}

