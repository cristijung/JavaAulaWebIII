package ProgramaNumero;
import java.util.Scanner;

public class MainNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //instanciar a classe Numero
        Numero n1 = new Numero();

        //invocar o método acessor
        System.out.println("Digite um número: ");
        n1.setValor(ler.nextInt());

        //invocar o método de verificação de número:
        System.out.println(n1.verificarValor());
        
    }
}
