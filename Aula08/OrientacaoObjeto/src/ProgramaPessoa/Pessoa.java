package ProgramaPessoa;
/*INSTRUÇÕES ALGORIMTO
* Criar uma classe com nome Pessoa:
- Atributos:
Nome publico
idade privado
peso privado
- Métodos acessores
*/

public class Pessoa {
    //atributos
    public String nome;
    private int idade;
    private double peso;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
