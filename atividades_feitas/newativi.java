package atividades_feitas;
import java.util.Scanner;

public class newativi {
/**
 * @param args
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual cor você está usando ");
    String cor = sc.nextLine();
    System.out.println("Qual a sua idade");
    int idade = sc.nextInt();
   

    if (idade >= 18 && cor.equals("preto") || cor.equals("verde")){
        System.out.println("Você não pode entrar");}
        else if (idade >= 18){
        System.out.println("Você pode entrar");    
    }else {System.out.println("Você não pode entrar");} 
}
}

