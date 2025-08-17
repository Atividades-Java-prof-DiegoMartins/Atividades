package listas.quartoze_agosto;
import java.util.Scanner;

public class atividade_castigo_escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QUantas vezes ele deve repitir a frase: ");
        int vezes = sc.nextInt();

        for(int i=0; i < vezes; i++ ){
            System.out.println("Java não é para amadores!");
        }
        
    }
    
}
