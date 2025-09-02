package atividades_feitas;
import java.util.Scanner;

public class aula_22_abril {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o usuário: ");
    String user = sc.nextLine();
    System.out.println("Digite a senha: ");
    String senha = sc.nextLine();
    if (user.equals ("admin") && senha.equals ("senhasegura")){
        System.out.println("Acesso liberado");
    }else {
        System.out.println("Acesso não liberado");
    }
    
}  
}
