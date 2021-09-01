
public class Pessoa{
    
    public static void main(String args[]) {
        //declaracão dos atributos
        
        String nome, sobrenome, profissao;
        
        nome = "Josefa";
        sobrenome = "Souza";
        profissao = "Farmacêutica";
        
        int idade = 32;
        double altura, salarioHora, horas;
        altura = 1.78;
        salarioHora = 234.78;
        horas = 40;
        
        System.out.println("Dados Cadastrais - RH");
        System.out.println("**********************");
        System.out.println("Nome: " + nome + "\n" + 
                          "Sobrenome: " + sobrenome + "\n" + 
                          "Altura: " + altura + "\n" + "Cargo: " + profissao);
                          
        System.out.println("Dados Cadastrais - Financeiro");
        System.out.println("**********************");
        System.out.println("O salário de: " + nome + " é:");
        System.out.println("Trabalho de 40h semanais: " + ((salarioHora * horas) * 4));
    }
    
}
    