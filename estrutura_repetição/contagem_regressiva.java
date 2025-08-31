package estrutura_repetição;
import java.util.Scanner;

public class contagem_regressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //for (i=5; i>0; i--){
            //System.out.println(i);

        //}
        System.out.println("Inicie a contagem regressiva: ");
        int i = sc.nextInt();
        while(i>0){
            i = i-1;
            System.out.println(i);
            

        }
        
        
    }

    
}
