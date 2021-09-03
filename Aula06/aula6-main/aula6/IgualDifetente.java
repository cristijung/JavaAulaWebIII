/**
 * criar um algoritmo que leia dois valores reais digitados
 * e informa se estes valores são iguais ou diferentes
 */
import java.util.Scanner;

public class IgualDifetente{
    public static void main(String[] args) {
        
        int n1,n2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor 1: ");
        n1 = ler.nextInt();
        System.out.println("Digite o valor 2: ");
        n2 = ler.nextInt();
        
        if ((n1 == n2)) {
            System.out.println("os numeros digitados são iguais");
        }else {
            System.out.println("os numeros digitados são diferentes!");
        }
        }
    }
