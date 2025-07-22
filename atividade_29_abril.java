import java.util.Scanner;

public class atividade_29_abril{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o seu cpf: ");
    String cpf = sc.nextLine();
    System.out.println("Digite o seu rg: ");
    String rg = sc.nextLine();

    if(cpf.isEmpty() || (rg.isEmpty())){
        System.out.println("CPF ou RG não cadastrados");
    }else {
        System.out.println("CPF e RG cadastrados com sucesso");
    }
}
}
    

