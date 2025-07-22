package atividades_feitas;
import java.util.Scanner;
public class atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da conta");
        double preco = sc.nextDouble();
        System.out.println("Informe o número de pessoas");
        int pessoas = sc.nextInt();
        double valor = preco / pessoas;
        System.out.println("O total por pessoal será R$ " + valor);
        System.out.println("Informe o valor da porcentagem da gorgeta");
        double gorget = sc.nextDouble();
        int porcent = 100;
        double calculogorget = gorget / porcent;
        double gorgetaevalortotal = (preco * calculogorget) + preco;
        double comgorgeta = gorgetaevalortotal / pessoas;
        System.out.println("O valor por pessoa será " + comgorgeta);

    }
}
