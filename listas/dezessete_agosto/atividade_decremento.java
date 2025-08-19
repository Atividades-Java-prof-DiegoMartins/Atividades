package listas.dezessete_agosto;
import java.util.Scanner;
import java.util.ArrayList;

public class teste_atividade {
    public static void main(String[] args) {
        ArrayList<String>nomesaleatorios=new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Informe um nome: ");
            nomesaleatorios.add(sc.nextLine());
        }

        for (int j=4; j<3; j--){
            System.out.println("Foram cadastrados " + nomesaleatorios);
        }
        
        
        
    }
    
}
