
import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int numLer = 3;
        int maximo = 0;
        int minimo = 0;

        for(int i = 0; i < numLer; i ++) {
            System.out.println("Digite um número inteiro: ");
            int num = ler.nextInt();
            
            if(num < minimo) {
                minimo = num;
            }
            if(num > maximo) {
                maximo = num;
            }
        }
        System.out.println("O maior número digitado é: " + maximo);

    }
}
