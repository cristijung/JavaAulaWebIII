//Array

public class ModVetor {
    public static void main(String[] args) {

        int[] arrayUm = {12, 14, 3, 5, 68, 54, 104, 321};
        int[] arrayDois = {18, 22, 34, 56, 11, 31, 67, 49, 204, 124, 678};
        
        //declaração de array com instância
        int[] arrayTres;
        arrayTres = new int[10];
        arrayTres[0] = 1;
        arrayTres[1] = 2;
        arrayTres[2] = 3;
        arrayTres[3] = 4;
        arrayTres[4] = 5;
        arrayTres[5] = 6;
        arrayTres[6] = 7;
        arrayTres[7] = 8;
        arrayTres[8] = 9;
        arrayTres[9] = 10;


        if(arrayDois.length > 8) {
            System.out.println("Tamanho do ArrayDois - Maior do que 8");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor do que 8");
        }

        System.out.println("Tamanho do ArrayUm = " + arrayUm.length);
        System.out.println("Tamanho do ArrayDois = " + arrayDois.length);
        System.out.println("Tamanho do ArrayTres = " + arrayTres.length);

    }
    
}
