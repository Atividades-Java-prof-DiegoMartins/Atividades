package atividades_feitas;
import java.util.Scanner;

public class atividade_temperatura {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a temperatura? ");
    int temp = sc.nextInt();
    if(temp < 17){
        System.out.println("Leve CASACO!");
    } else if (temp <= 24 || temp == 17){ 
        //Demorei para entender  lógica de >= 17 que seria qualquer número maior que 17, o 25 entraria, ai alterei para temp ==17
        System.out.println("Leve CAMISA!");  
        
    } else{
        System.out.println("Leve REGATA OU VESTIDO");
    }


    } 
}
