package funcoes;
import java.util.Scanner;

public class ativdadetemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //double conversaoc = convercelsius(sc);


        System.out.println("Escolha 1 para converter em Celsius e 2 para Fahrenheit!");

        while(true){

            System.out.println("Escolha uma opção de conversão de temperatura. ");
            int opcao = sc.nextInt();
            
            if(opcao == 1){
                System.out.println("Qual o valor que você quer converter: ");
                double f = sc.nextDouble();
                double c = (f - 32) * (5/9);
                System.out.println(f + " Em Celsius é " + c);

            }

            else if (opcao == 2){
                System.out.println("Qual o valor que você quer converter: ");
                double c = sc.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println(c + " Em Fahrenheit é " + f);

            }
            break;
        
        }

        
    }
    //public static double convercelsius(Scanner sc){
        //System.out.println("Qual o valor que você quer converter: ");
        //double f = sc.nextDouble();
        //double c = (f - 32) * (5/9);
        //System.out.println(f + " Em Celsius é " + c);
        //return f;
       
    //}
    
}
