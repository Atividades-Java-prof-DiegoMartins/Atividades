package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade_quantas_letras {

     public static void main(String[] args) {
        ArrayList<String>nomes=new ArrayList<>();
        ArrayList<String>listanova=new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++){ //Laço de repetição
            System.out.println("Informe o seu nome: ");
            nomes.add(sc.nextLine());

        }

        for(String nome:nomes){
            
            if (nome.length() > 5 ){
                listanova.add(nome);
                //int tamanho = listanova.size();
                //System.out.println("Tem " + tamanho + " pessoa na lista, o nome dela é " + listanova);  
            } 
            //DÚVIDA: A cada nome que é add na lista é exibindo o print, se eu add 4 pessoas com nome maior que 5, exibirá 5 linhas printada
        
        }
         int tamanho = listanova.size();
         System.out.println("Tem " + tamanho + " pessoa na lista, o nome dela é " + listanova);

     }

    
}
