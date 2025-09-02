package projetos;
import java.util.Scanner;
public class lojinha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("CASAS BAHIA - PRODUTOS");
        System.out.println("======================");
        System.out.println(" 1 - Cadastrar produtos");
        System.out.println(" 2 - Listar produtos");
        System.out.println(" 3 - Atualizar produtos");
        System.out.println(" 4 - Removerr produtos");
        System.out.println(" 0 - Sair");

        

        while(true){

            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Estou cadastrando");
                //adicionar na lista. Criar lista
                //exibir frase produto cadastrado

            }else if (opcao == 2 ){
                System.out.println("Listar produtos");

            }else if(opcao == 3){
                System.out.println("Atualizar produtos");
            }else if(opcao == 4){
                System.out.println("Remover produto");

            }else if(opcao == 0){
            break;
            }

        }





        
    }
    
}
