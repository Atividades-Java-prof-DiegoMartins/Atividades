package atividades_feitas;
import java.util.Scanner;

public class atividade_4_15_abril {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o número: ");
    int num = sc.nextInt();
    if( num % 2 == 0){
        System.out.println("O número é PAR ");
    } else {System.out.println("O número é ÍMPAR ");}
}   
}
