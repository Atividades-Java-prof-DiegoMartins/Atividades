package atividades_feitas;
import java.util.Scanner;

public class atividade_temperatura {
    public static void main(String[] args) {
    
    int temp = inicio();

    if(temp < 17){
        //int temp = sc.nextInt();
        casaco();
    } else if (temp <= 24 || temp == 17){ 
        //Demorei para entender  lógica de >= 17 que seria qualquer número maior que 17, o 25 entraria, ai alterei para temp ==17
        camisa();
        
    } else{
        regavest();  
    }

    } 

    public static int inicio (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura? ");
        int temp = sc.nextInt();
        return temp;
    }

    public static void casaco(){
        System.out.println("Leve CASACO!");

    }

    public static void camisa(){
        System.out.println("Leve CAMISA!");  

    }

    public static void regavest(){
        System.out.println("Leve REGATA OU VESTIDO");

    }
}

