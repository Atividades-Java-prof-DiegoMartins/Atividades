package listas;
import java.util.ArrayList;
import java.util.Scanner;

public class atividade_numeros_pares {
    public static void main(String[] args) {
        ArrayList<Integer>listanum=new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe cinco números: ");
        //int numumeros = sc.nextInt();
        //System.out.println("Informe o segundo número: ");
        //int numsegund = sc.nextInt();
        //DÚVIDA: Eu gostaria de pedir 5x que o usuário adicione um número.
        

        listanum.add(sc.nextInt());
        listanum.add(sc.nextInt());
        listanum.add(sc.nextInt());
        listanum.add(sc.nextInt());
        listanum.add(sc.nextInt());
        //System.out.println(listanum + "é a lista");
        
        for (Integer numeross:listanum){
            if(numeross % 2 == 0){ //descobri que, ao colocar a variável numeross, a lista será varrida e vai exibir no print apenas números pares.
                System.out.println("Números PARES digitados " + numeross);

            }
        }
            
    }

}
