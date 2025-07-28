package listas;

import java.util.Scanner;
import java.util.ArrayList;


public class atividade_numeros_impares {
    public static void main(String[] args) {
        ArrayList<Integer>listnumeros=new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int nsegundo = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int nterceiro = sc.nextInt();

        listnumeros.add(num);
        listnumeros.add(nsegundo);
        listnumeros.add(nterceiro);

        for(Integer todosnumeros:listnumeros){
            if(todosnumeros % 2 != 0){
                System.out.println("Os números ÍMPARES são: " + todosnumeros);

            }
        }


    }
    
}
