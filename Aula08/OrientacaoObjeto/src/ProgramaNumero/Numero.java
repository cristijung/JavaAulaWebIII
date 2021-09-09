package ProgramaNumero;
/*
* INSTRUÇÕES DO ALGORITMO
Criar uma Classe Numero com as seguintes informações:
- Atributos: 
valor do tipo int;
- Métodos:
1. getValor
2. setValor
Verificar retornando uma String informando se o valor é positivo ou negativo
---------------------------------------------------------------------------
*/

public class Numero {
    //atributo definido como privado
    private int valor;

    //métodos acessores
    //método SET é responsável por "gravar - armazenar" o valor atribuido
    //método SET não possui retorno, mas informamos por parâmetro qual o tipo 
    //de dado que ele gravará
    public void setValor(int valor) {
        this.valor = valor;
    }

    //método GET - obtém ou consulta o dado registrado pelo método set
    //este método possui retorno, pois precisamos "buscar" o que foi armazenado
    public int getValor() {
        return this.valor;
    }

    //método de execução que irá fazer a comparação do números
    public String verificarValor() {
        String resposta;
        if(this.valor >= 0) {
            resposta = "Este número é positivo";
        }else{
            resposta = "Este número é negativo";
        }
        return resposta;

    }

    
}
