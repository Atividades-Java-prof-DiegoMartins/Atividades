package funcoes;

public class PadariaSemFuncoes {
  public static void main(String[] args) {

    inicio();

    menu();
    
    consumo();


    System.out.println("=== Obrigado pela preferência ===");
  }

  public static void inicio(){
    System.out.println("=== Bem-vindo à Padaria ===");

  }

  public static void menu(){
    System.out.println("1. Pão - R$0,50");
    System.out.println("2. Café - R$1,50");
    System.out.println("3. Bolo - R$4,00");
  }

  public static void consumo(){
    System.out.println("Você comprou: Pão e Café");
    System.out.println("Total: R$2,00");
  }
  

}

