package listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class atividade_numeros_impares {
    public static void main(String[] args) {
        ArrayList<Integer>listnumeros=new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
       
        try {
        listnumeros.add(sc.nextInt());
        listnumeros.add(sc.nextInt());
        listnumeros.add(sc.nextInt());

        for(Integer todosnumeros:listnumeros){
            if(todosnumeros % 2 != 0){
                System.out.println("Os números ÍMPARES são: " + todosnumeros);

            }
        }

        }catch (InputMismatchException e){
            System.out.println("Informe um Número válido e não uma palavra!!!");

        }

        
    }
    
}
