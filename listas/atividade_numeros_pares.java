package listas;
import java.util.ArrayList;
import java.util.Scanner;

public class atividade_numeros_pares {
    public static void main(String[] args) {
        ArrayList<Integer>listanum=new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe um número: ");
        int numum = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int numsegund = sc.nextInt();
        System.out.println("Informe o terceiro número: ");
        int numterc = sc.nextInt();
        System.out.println("Informe o quarto número: ");
        int numquarto = sc.nextInt();
        System.out.println("Informe o quinto número: ");
        int numquinto = sc.nextInt();

        listanum.add(numum);
        listanum.add(numsegund);
        listanum.add(numterc);
        listanum.add(numquarto);
        listanum.add(numquinto);

        //System.out.println(listanum.get(0));
        //System.out.println(listanum.get(1));


        for (Integer numeross:listanum){
            if(numeross % 2 == 0){ //descobri que, ao colocar a variável numeross, a lista será varrida e vai exibir no print apenas números pares.
                System.out.println("Números PARES digitados " + numeross);

            }
        }
            
    }

    
}

            //TENTATIVAS DE CÓDIGO
            //else{
                //System.out.println(numeross + " Não é PAR!");
            //}
            
            //if (numsegund % 2 == 0){ //Não consegui colocar um else if aqui, por que?
                //System.out.println(numsegund + "é PAR");
            //}else {
                //System.out.println(numsegund + "NÃO é PAR");
            //}
            
            //System.out.println(numeross);
            //if(numum % 2 == 0){
                //System.out.println(numum + "é PAR!");

            //}else if(numum != 0){
                //System.out.println(numum + "NÃO é PAR");
            //}if (numsegund % 2 == 0){ //Não consegui colocar um else if aqui, por que?
                //System.out.println(numsegund + "é PAR");
            //}else {
                //System.out.println(numsegund + "NÃO é PAR");
            //}