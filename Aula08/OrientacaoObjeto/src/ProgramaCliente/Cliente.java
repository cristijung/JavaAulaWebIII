public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    public double getRenda(){
        return renda;
    }

    //métodos de classificação de idade
    // e de classificar renda
    public String classificarIdade() {
        String resposta;
        if(this.idade >= 18) {
            resposta = "Esse cliente é maior de idade";
        }else{
            resposta = "Esse cliente é menor de idade";
        }
        return resposta;
    }

    public String classificarRenda() {
        String resultado;
        if(this.renda >= 20000) {
            resultado = "Esse cliente é rico";
        }else{
            resultado = "Esse cliente não é rico";
        }
        return resultado;
    }

    
}
