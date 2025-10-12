package funcoes;

import java.util.Scanner;

public class conversor_moeda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************Conversor de Moedas************");
        System.out.println("Você gostaria de converter para dolar, euro ou peso? ");
        String opcao = sc.nextLine();
        System.out.println("Informe o valor em reais: ");
        double real = sc.nextDouble();

        if ( opcao.equals("dolar") ){

            double conversaodoll = dolar(real); 
            System.out.println("O seu valor em dólares será " + conversaodoll);

        }else if (opcao.equals("euro")) {
            double conversaoeuro = euro(real);
            System.out.println("O seu valor em euro será " + conversaoeuro);

        }else if (opcao.equals("peso")){
            double conversaopeso = euro (real);
            System.out.println("O seu valor em peso será " + conversaopeso);

        }    

    }

    public static double dolar (double valoreal){
        //entendi que o parâmeto valoreal é o valor ou variável que será recebida para entrar no cálculo
        //se o usuário digitar qualquer valor, será recebido dentro de double real linha 14, por isso que tenho que colocar essa variável no parâmetro quando vou utilizar as funções.
        double doll = valoreal / 5.0;
        return doll;

    }

    public static double euro (double valoreal){
        double eurro = valoreal / 6.0;
        return eurro;

    }

    public static double peso (double valoreal){
        double pesso = valoreal / 50.0;
        return pesso;
    }
 }

