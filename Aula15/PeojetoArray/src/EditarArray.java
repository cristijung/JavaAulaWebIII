//Manipulando ArrayList
//comando adicionar elemento - add
//comando remover elemento - remove
//comando consultar elementos - get
//comando para limpar elementos - clear
//comando para ordenar elementos - classe Collection

import java.util.ArrayList;
import java.util.Collections;

public class EditarArray {
    public static void main(String[] args) throws Exception {
        
        String e1 = "Amarelo";
        String e2 = "Azul";
        String e3 = "Roxo";
        String e4 = "Laranja";
        String e5 = "Verde";
        String e6 = "Vermelho";

        ArrayList<String> elementos = new ArrayList<>();
        //comando para adicionar elementos no Arraylist
        elementos.add(e1);
        elementos.add(e2);
        elementos.add(e3);
        elementos.add(e4);
        elementos.add(e5);
        elementos.add(e6);
        elementos.add("Rosa");
        elementos.add("124");

        System.out.println(elementos);

        //comando para remover 
        //nome do arraylist + comando + índice
        elementos.remove(0);
        System.out.println(elementos);

        //adicionando elemento de forma direta
        elementos.add("Preto");
        System.out.println(elementos);

        //consultando elementos pelo índice
        String verElemento = elementos.get(3);
        System.out.println("O elemento no índice 3 do ArrayList é? " + verElemento);

        //ordenando elementos
        Collections.sort(elementos);
        System.out.println("Após da ordenação");
        System.out.println(elementos);


    }
}
