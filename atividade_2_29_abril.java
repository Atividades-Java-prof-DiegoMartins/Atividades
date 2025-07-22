import java.util.Scanner;
public class atividade_2_29_abril {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu cor: ");
        String user = sc.nextLine();
        System.out.println("Qual a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Qual cor você está usando? ");
        String cor = sc.nextLine();
        if (idade < 18){
            System.out.println("Você não pode entrar no estádio");
        }else if (idade >= 18) {
            if (cor.equals("preto") || (cor.equals("verde")))
        System.out.println("Você não pode entrar.");


    }
    
}}
