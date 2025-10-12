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
                double conversaoc = convercelsius(f);
                System.out.println(f + "Fahrenheit" + "Em Celcius " + "é " + conversaoc);

            }

            else if (opcao == 2){
                System.out.println("Qual o valor que você quer converter: ");
                double c = sc.nextDouble();
                double conversaof = converfarenheit(c);
                System.out.println(c + "Celsius" +  "Em Fahrenheit é " + conversaof );

            }
            break;
        
        }
        
    }
    public static double convercelsius(double f){
        double c = (f - 32) * (5/9);
        return c;
       
    }

    public static double converfarenheit (double c){
        double f = (c * 9 / 5) + 32;
        return f;
        
    }
    
}
