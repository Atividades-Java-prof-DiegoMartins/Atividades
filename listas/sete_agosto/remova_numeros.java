package listas.sete_agosto;
import java.util.Scanner;
import java.util.ArrayList;

public class remova_numeros {
    public static void main(String[] args) {
        ArrayList<Integer>todososnumeros=new ArrayList();
        ArrayList<Integer>novosnumeros=new ArrayList();
        Scanner sc = new Scanner(System.in);
        

        for (int i=0; i <5; i++ ){
            System.out.println("Informe um número: ");
            todososnumeros.add(sc.nextInt());    
            
        }
        
        //System.out.println(todososnumeros);
        
        for (Integer num:todososnumeros){
            if(num > 6) {
                novosnumeros.add(num);

            }  
        }
        System.out.println(todososnumeros);
        System.out.println(novosnumeros);
          
    }
    
}
