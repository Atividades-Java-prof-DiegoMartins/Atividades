package funcoes;
import java.util.Scanner;

public class menutech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a fome Tech!");
        System.out.println("================================");

        while(true){
            System.out.println("Selecione 1 para doces, 2 para salgados e 0 para sair.");
            System.out.println("Opção: ");
            int opcao = sc.nextInt();

            if(opcao == 1){
                doces();
            } else if (opcao == 2){
                salgados();
            }else if (opcao == 0){
                System.out.println("\nEncerrando o programa... Obrigado por visitar o Fome de Tech!");
                break;
            } else {
                System.out.println("\nOpção inválida! Tente novamente.\n");

            }
        }  

    }
    public static void salgados (){
        System.out.println("\nSalgados");
        System.out.println("- Salgado 1 (R$ 10,00)");
        System.out.println("- Salgado 2 (R$ 12,90)");
        System.out.println("- Salgado 3 (R$ 15,60)\n");

    }
    public static void doces (){
        System.out.println("\nDoces");
        System.out.println("- Doce 1 (R$ 10,00)");
        System.out.println("- Doce 2 (R$ 12,90)");
        System.out.println("- Doce 3 (R$ 15,60)\n");   
    }
    
}
