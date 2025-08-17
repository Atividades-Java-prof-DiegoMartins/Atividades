package listas.sete_agosto;
import java.util.Scanner;
import java.util.ArrayList;

public class numero_na_lista {
    public static void main(String[] args) {
        ArrayList<Integer>listnum=new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();
       
       listnum.add(2);
       listnum.add(15);
       listnum.add(19);
       listnum.add(23);

       for (Integer nu:listnum){ //colocando if e else dentro do for, ele repete o print 4x
          
       }
       if (listnum.contains(num)){ //percebi que eu coloquei numero.contais e deu errado.
        System.out.println("O" + num + " Está na lista");
        } else {
        System.out.println("O" + num + " NÃO enstá na lista");
        }
       
    }
}
