package listas.quartoze_agosto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        try {
            int tabuada = sc.nextInt();
    
        System.out.println( "Tabuada do " + tabuada);

        for (int i=1; i<=10; i++){
            
            int resultado = tabuada * i;

            System.out.println(tabuada + "X" + i + "=" + resultado);
        }
         }catch(InputMismatchException e){
            System.out.println("Informe um número interiro e não uma palavra");
        }
        
    }
    
}
