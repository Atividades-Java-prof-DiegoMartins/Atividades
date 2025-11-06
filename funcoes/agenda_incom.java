package funcoes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agenda_incom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> nomes = new ArrayList<String>();
    List<String> numeros = new ArrayList<String>();

    System.out.println("**** Agenda Eletrônica ****");
    while (true) {
      mostrarOpcoes();

      System.out.println("Selecione uma opção: ");
      int opcao = sc.nextInt();
      sc.nextLine(); // consome
      if (opcao == 1) {

        cadastrarContato(sc, nomes, numeros);
      } else if (opcao == 2) {
        mostrarContatos(nomes, numeros);
      } else if (opcao == 0) {
        break;
      } else {
        System.out.println("Opção inválida!");
      }
    }

    System.out.println("Agenda Encerrada.");

    sc.close();
  }

  public static void mostrarOpcoes() {
    System.out.println("1 - Cadastrar contato");
    System.out.println("2 - Mostrar contato");
    System.out.println("0 - Sair");
  }

  public static void cadastrarContato(Scanner sc, List <String>nomes, List <String>numeros  ) {
    System.out.println("Me informe o seu nome: ");
    String nome = sc.nextLine();
    nomes.add(nome);
    System.out.println("Me informe o seu número: ");
    String numero = sc.nextLine();
    numeros.add(numero);
  }

  public static void mostrarContatos(List<String> nomes, List<String> numeros) {
    for (int i =0; i < nomes.size(); i ++){
        String nome = nomes.get(i); // 1
        String numero = numeros.get(i); // 1
        System.out.println(nome + " - " + numero);
    }

  }
}