package funcoes;

import java.util.Scanner;

public class delivery {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("=== Fome de Tech - Checkout ===");

    String cliente = nomecliente(sc);

    int n = quantidadeproduto(sc);

    double subtotal = 0.0;

    for (int i = 1; i <= n; i++) {
      System.out.println("\nItem #" + i);
      System.out.print("Nome do item: ");
      String nomeItem = sc.nextLine();
      System.out.print("Preço unitário: ");
      double preco = sc.nextDouble();
      System.out.print("Quantidade: ");
      int qtd = sc.nextInt(); sc.nextLine();

      double totalItem = preco * qtd;
      subtotal += totalItem;

      System.out.println("Subtotal parcial: R$ " + String.format("%.2f", subtotal));
    }

    double calcfret = calcfrete (sc);

    // R$5 + R$1,20 por km

    System.out.print("Cupom (FOME10, FRETEGRATIS ou ENTER para nenhum): ");
    String cupom = sc.nextLine().trim();

    double desconto = 0.0;
    if (cupom.equalsIgnoreCase("FOME10")) {
      desconto = subtotal * 0.10; // 10% no subtotal
    } else if (cupom.equalsIgnoreCase("FRETEGRATIS")) {
      if (calcfret <= 10.0) {
        calcfret = 0.0; // zera frete até 10 km
      } else {
        calcfret = calcfret / 2.0; // metade do frete se passar de 10 km
      }
    } else if (!cupom.isEmpty()) {
      System.out.println("Cupom inválido! Prosseguindo sem cupom...");
    }

    double total = subtotal - desconto + calcfret;

    System.out.print("\nForma de pagamento (pix / credito / dinheiro): ");
    String pagamento = sc.nextLine().trim();

    double troco = 0.0;
    if (pagamento.equalsIgnoreCase("dinheiro")) {
      System.out.print("Valor recebido em dinheiro: ");
      double recebido = sc.nextDouble(); sc.nextLine();
      if (recebido < total) {
        System.out.println("Valor insuficiente! Operação cancelada.");
        sc.close();
        return;
      } else {
        troco = recebido - total;
      }
    } else if (!pagamento.equalsIgnoreCase("pix") && !pagamento.equalsIgnoreCase("credito")) {
      System.out.println("Forma de pagamento inválida! Operação cancelada.");
      sc.close();
      return;
    }

    System.out.println("\n=== Recibo ===");
    System.out.println("Cliente: " + cliente);
    System.out.println("Itens: " + n);
    System.out.println("Subtotal: R$ " + String.format("%.2f", subtotal));
    System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
    System.out.println("Frete: R$ " + String.format("%.2f", calcfret));
    System.out.println("TOTAL: R$ " + String.format("%.2f", total));
    System.out.println("Pagamento: " + pagamento);
    if (pagamento.equalsIgnoreCase("dinheiro")) {
      System.out.println("Troco: R$ " + String.format("%.2f", troco));
    }
    System.out.println("Obrigado por pedir no Fome de Tech!");

    sc.close();

    }

    public static String nomecliente(Scanner sc) {
      System.out.print("Nome do cliente: ");
      String cliente = sc.nextLine();
      return cliente;
    }

    public static int quantidadeproduto(Scanner sc) {
      System.out.print("Quantos itens diferentes deseja cadastrar? ");
      int n = sc.nextInt(); sc.nextLine();
      return n;
    }
    public static double calcfrete (Scanner sc ){
      System.out.print("\nDistância até o cliente (km): ");
      double distanciaKm = sc.nextDouble(); sc.nextLine();
      double freteBase = 5.00;
      double frete = freteBase + (1.20 * distanciaKm); // R$5 + R$1,20 por km
      return frete;

    }
    
}
