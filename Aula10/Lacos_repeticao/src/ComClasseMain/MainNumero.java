package ComClasseMain;
import java.util.Scanner;

public class MainNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor: ");
        valor = ler.nextInt();
        Numero n = new Numero(valor);

        System.out.println("Fatorial: " + n.calcularFatorial());


    }
    
}
