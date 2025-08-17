package atividades_feitas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
public class aluno_presente {
        public static void main(String[] args) {
            ArrayList<String> alunos = new ArrayList<>(Arrays.asList(
                "Ana", "Bruno", "Carlos", "Daniela", "Eduardo"
            ));

            Scanner sc = new Scanner(System.in);

            System.out.println("Informe o seu nome: ");
            String nome = sc.nextLine();

            for (String nomealuno:alunos){

                if (nome.equals(nomealuno) ){
                    System.out.println("PRESENTE");
                } 
                
            }



        }


    
}
