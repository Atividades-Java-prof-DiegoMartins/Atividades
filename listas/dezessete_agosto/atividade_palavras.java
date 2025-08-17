package listas.dezessete_agosto;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade_palavras {
    public static void main(String[] args) {

        ArrayList<String>todaspalavras=new ArrayList();
        ArrayList<String>novaspalavrinhas=new ArrayList();
        ArrayList<String>novospalavroes=new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        

        for (int i=0; i<4; i++){
            System.out.println("Informe uma palvra: ");
            todaspalavras.add(sc.nextLine());
        }

        //System.out.println(todaspalavras);
        
        for (String palavra:todaspalavras){            
            if (palavra.length() < 5 ){
                novaspalavrinhas.add(palavra);

            } else if (palavra.length() > 5) {
                novospalavroes.add(palavra);    
            }

        }
         System.out.println( "Palavrinhas" + novaspalavrinhas);
         System.out.println("Palavrões"  + novospalavroes);
        
    }
    
}
