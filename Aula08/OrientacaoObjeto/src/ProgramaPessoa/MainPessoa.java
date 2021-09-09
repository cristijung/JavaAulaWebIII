package ProgramaPessoa;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    Pessoa p1 = new Pessoa();

    System.out.println("Digite o nome: ");
    p1.nome = ler.next();

    //invocação do métodos por causa da visibilidade dos atributos
    //usa-se o método set para "gravar" os valores nos atributos
    System.out.println("Digite a idade: ");
    p1.setIdade(ler.nextInt());

    System.out.println("Digite o peso: ");
    p1.setPeso(ler.nextDouble());

    //configuração de saída usando o método get, pois este método
    //é responsável pela "consulta" do valor gravado pelo 
    //método set.
    System.out.println("Visualizando os dados:" + "\n" +
                        "Nome: " + p1.nome + "\n" +
                        "Idade: " + p1.getIdade() + "\n" +
                        "Peso: " + p1.getPeso());

    }
}
