package atividades_feitas;
import java.util.Scanner;

public class atividade_3_15_abril {
/**
 * @param args
 */
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a sua idade: ");
    int idade = sc.nextInt();
    if(idade <= 12){
        System.out.println("Você é uma criança.");
    }else if (idade > 12 && idade <= 17){ 
        System.out.println("Você é um adolescente.");

    }else {System.out.println("Você é um adulto.");}

}   
}
