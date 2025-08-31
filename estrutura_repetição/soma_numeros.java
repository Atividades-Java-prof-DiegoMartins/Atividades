package estrutura_repetição;
import java.util.Scanner;


public class soma_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float somaum = 0;
        float calculo = 0;
        
        while (somaum >= 0){
            
            calculo = calculo + somaum;
            System.out.println("Informe um número: ");
            somaum =sc.nextFloat();

        }
        System.out.println(calculo);
        
        


    }
    
}
