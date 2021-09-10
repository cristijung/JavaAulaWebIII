import java.util.Scanner;

public class MainData {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Data d1 = new Data();

        System.out.println("Informe o dia: ");
        d1.setDia(ler.nextInt());
        System.out.println("Informe o número do mês: ");
        d1.setMes(ler.nextInt());
        System.out.println("Informe o ano: ");
        d1.setAno(ler.nextInt());

        System.out.println("Visualizando a data: ");
        System.out.print(d1);

        
    }
}
