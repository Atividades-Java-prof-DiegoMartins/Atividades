package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade_quantas_letras {

     public static void main(String[] args) {
        ArrayList<String>nomes=new ArrayList<>();
        ArrayList<String>listanova=new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");

        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());

        //System.out.println(nomes);

        for(String nome:nomes){
            
            if (nome.length() > 5 ){
                listanova.add(nome);
                int tamanho = listanova.size();
                System.out.println("Tem " + tamanho + " pessoas na lista, o nome dela é " + listanova);

                
            }
            
        }

     }

    
}
