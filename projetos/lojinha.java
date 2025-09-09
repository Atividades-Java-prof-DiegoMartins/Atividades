package projetos;
import java.util.Scanner;
import java.util.ArrayList;
public class lojinha {
    public static void main(String[] args) {
        ArrayList<String>cadastrados=new ArrayList();

        Scanner sc = new Scanner(System.in);
        Scanner novoprod = new Scanner(System.in);

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
                System.out.println("Informe o nome do produto:");
                String produto = novoprod.nextLine();
                cadastrados.add(produto);
                System.out.println("Produtos cadastrados " + cadastrados); //teste lista

            }else if (opcao == 2 ){
                System.out.println("produtos cadastrados " + cadastrados);

            }else if(opcao == 3){
                for (String produtlis:cadastrados){
                    System.out.println(cadastrados);
                    System.out.println("Informe qual produto deseja alterar: ");
                    String produtlist = sc.nextLine();
                    
                    if (cadastrados.contains(produtlist)){
                        System.out.println("digite a alteração");
                        String produtnew = sc.nextLine();
                        cadastrados.remove(produtlist);
                        cadastrados.add(produtnew);
                        System.out.println("Nova lista " + cadastrados);


                    }
                }


                System.out.println("Atualizar produtos");
            }else if(opcao == 4){
                System.out.println("Remover produto");

            }else if(opcao == 0){
            break;
            }

        }





        
    }
    
}
