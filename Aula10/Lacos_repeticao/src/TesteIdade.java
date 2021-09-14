/*
Do While = Faça enquanto
*/

public class TesteIdade {
    public static void main (String[] args) {
        int idade = 12;

        do {
            System.out.println("Você não tem permissão para entrar");
            idade ++;
        }while (idade < 18);
    }
    
}

