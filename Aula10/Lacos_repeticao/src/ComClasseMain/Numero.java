package ComClasseMain;
public class Numero {
    private int valor;

    //construtor para atributo
    public Numero (int valor) {
        this.valor = valor;
    }

    //métodos set e get para o atributo
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }

    //método para calcular o fatorial
    //usando o laço For
    public int calcularFatorial() {
        int x;
        int resposta = 1;

        for(x = 1; x <= valor; x ++); {
            resposta = resposta * x;
        }
        return resposta;
    }    
}
