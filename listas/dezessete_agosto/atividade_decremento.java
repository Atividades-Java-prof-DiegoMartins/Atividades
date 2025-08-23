package listas.dezessete_agosto;
import java.util.Scanner;
import java.util.ArrayList;

public class atividade_decremento {
    public static void main(String[] args) {
        ArrayList<String>nomesaleatorios=new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Informe um nome: ");
            nomesaleatorios.add(sc.nextLine());
        }

        for (int i=2; i>=0; i--){
            System.out.println("Foram cadastrados " + nomesaleatorios.get(i) );
        }
        
        
        
    }
    
}
