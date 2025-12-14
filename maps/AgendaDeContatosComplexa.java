package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaDeContatosComplexa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, Map<String, String>> contatos = new HashMap<String, Map<String, String>>();


    String nome = "Diego";
    String nomedois = "Jeny";

    Map<String, String> dadosContatod = new HashMap<String, String>();

    dadosContatod.put("telefone", "182309890");
    dadosContatod.put("e-mail", "diego@gmail.com.br");
    dadosContatod.put("endereço", "Rua Lima, SP");

    Map <String, String> dadoscontatoj=new HashMap<String, String >();
    dadoscontatoj.put("telefone", "12345");
    dadoscontatoj.put("e-mail", "jeny@teste123.com.br");
    dadoscontatoj.put("endereço", "Rua Imperatriz, SP");

    contatos.put(nome, dadosContatod);
    contatos.put(nomedois, dadoscontatoj);

    Map <String,String> dadoscompletosdiego = contatos.get(nome);
    System.out.println("Este são os dados do Diego " + contatos.get(nome).get("telefone"));

    Map <String,String> dadoscompletojeniffer = contatos.get(nomedois);
    System.out.println("O E-mail da Jeniffer é" + dadoscompletojeniffer.get("e-mail"));
    

    
  }

}
