package atividades_feitas;
import java.util.Scanner;


public class atividade_multa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o limite da velocidade? ");
        int veloc = sc.nextInt();
        System.out.println("Qual a velocidade do infrator? ");
        int velocinfra = sc.nextInt();
        int calcmult = velocinfra - veloc;
        System.out.println("O cálculo entr a diferença da velocidade permitida e a velocidade do infrator deu " + calcmult );


        if (calcmult == 0 ){
            System.out.println("NÃO há multas");

        }else if(calcmult == 1 || calcmult <= 10){

            System.out.println("Infração LEVE! ");
        }else if(calcmult == 11 || calcmult <= 20){
            System.out.println("Infração MÉDIA! ");
        }else if(calcmult == 21 || calcmult <= 30){
            System.out.println("Infração GRAVE! ");
        }else if(calcmult == 30 || calcmult <= 40){
            System.out.println("Infração GRAVÍSSIMA! ");
        } else{
            System.out.println("Você está PRESO!");
        }

    }

}
