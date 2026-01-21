package listas.dezessete_agosto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class passei_de_ano {
    public static void main(String[] args) {
        ArrayList<Float>notas=new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        try {
            for(int i=0; i<5; i++){
            System.out.println("Informe a sua nota: ");
            notas.add(sc.nextFloat());

        }
        float media = (notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3) + notas.get(4)) / 5;
        System.out.println(media);
        for (Float nota: notas){
        }
        if (media >= 7.0){
            System.out.println("Você foi APROVADO!");
        }else if (media >= 5.0 && media <= 6.9){
            System.out.println("Você está em RECUPERAÇÃO");
        }else if (media < 5.0){
            System.out.println("Você está REPROVADO!");
        }

        } catch (InputMismatchException e){
            System.out.println("Informe um número válido e não uma palavra!!!");

        } 
    }
} 
//Observações: cometi o erro de colocar as condições dentro do segundo for e na condição recuperação tivi dififulcade atender a regra. 
