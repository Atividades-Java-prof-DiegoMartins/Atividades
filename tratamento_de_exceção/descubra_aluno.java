package tratamento_de_exceção;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class descubra_aluno {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of(
                "Ana", "Bruno", "Carla", "Diego", "Eduarda",
                "Felipe", "Gabriela", "Henrique", "Isabela", "João",
                "Karina", "Lucas", "Mariana", "Natália", "Otávio"));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o índice que você deseja");
        try {
            int indice = sc.nextInt();
            String name = nomes.get(indice);
            System.out.println(name);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Informe um índice entre 0 e 14");
        }
          catch(InputMismatchException e){
            System.out.println("Informe um número e não uma palavra");
         }

    }

}
