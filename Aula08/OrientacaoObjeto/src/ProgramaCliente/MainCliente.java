import java.util.Scanner;

public class MainCliente {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();

        //chamando métodos acessores
        System.out.println("Nome do cliente: ");
        c1.setNome(ler.next());

        System.out.println("Idade do cliente: ");
        c1.setIdade(ler.nextInt());

        System.out.println("Renda do Cliente: ");
        c1.setRenda(ler.nextDouble());

        //chamando e exibindo os outros métodos
        System.out.println("A renda do cliente está classifica como: " + c1.classificarRenda());
        System.out.println("A idade do cliente é: " + c1.classificarIdade());
    }
    

}
