package estrutura_repetição;
import java.util.Scanner;


public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int opcao = sc.nextInt();

        System.out.println("Bem-vindo(a) ao restaurante!");
        System.out.println("============================");

        System.out.println("Selecione 1 para doces, 2 para salgados e 0 para sair: ");
        int opcao = sc.nextInt();

        while(opcao ==1 || opcao ==2){
            if (opcao ==1){
                System.out.println("Doces");
                System.out.println("- Doce 1 (R$ 10,90)");
                System.out.println("- Doce 2 (R$ 12,90)");
                System.out.println("- Doce 3 (R$ 15,60)");
                System.out.println("Selecione 1 para doces, 2 para salgados e 0 para sair: "); //se não fosse essa linha, o menu doces iria exibir pra sempre.
                opcao = sc.nextInt();
            }else if (opcao == 2){
                System.out.println("Salgados");
                System.out.println("- Salgado 1 (R$ 10,90)");
                System.out.println("- Salgado 2 (R$ 12,90)");
                System.out.println("- Salgado 3 (R$ 15,60)");
                System.out.println("Selecione 1 para doces, 2 para salgados e 0 para sair: ");
                opcao = sc.nextInt();
            } else if (opcao == 0) {
                sc.close();
            }
        }
        

    }
    
}
