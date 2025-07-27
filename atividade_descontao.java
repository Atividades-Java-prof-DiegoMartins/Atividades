import java.util.Scanner;

public class atividade_descontao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String user = sc.nextLine();
        //user.isEmpty();
        System.out.println("Digite a sua senha de seis dígitos: ");
        String password = sc.nextLine();
        System.out.println("Você tem um resposável presente responda sim ou não: ");
        String responsavel = sc.nextLine();
        System.out.println("Você possui um cupom de desconto? (deixe vazio se não tiver): ");
        String cupom = sc.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
    
        if ((user == null || idade < 18 || password.length() < 6) ){
            //System.out.println("Cadastrado realizado!");  
            System.out.println("Não cadastrado");

        }else if ((password.length() >= 6) && cupom.equals("PROMO10") || cupom.equals("DESCONTO20") || cupom.equals("BLACKFRIDAY") || cupom == null){
            System.out.println("Cadastrado realizado!");

        }
        



    }
    
}
