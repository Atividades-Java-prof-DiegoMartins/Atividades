package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class alunos_aprovados {
    public static void main(String[] args) {
        ArrayList<Float>listalunosaprovados=new ArrayList();
        Scanner sc = new Scanner(System.in);

        //System.out.println("Informe o seu nome: ");
        //String user1 = sc.next();
        System.out.println("Informe a sua média: ");
        float nota1 = sc.nextFloat();
        System.out.println("Informe a sua média: ");
        float nota2 = sc.nextFloat();
        System.out.println("Informe a sua média: ");
        float nota3 = sc.nextFloat();

        listalunosaprovados.add(nota1);
        listalunosaprovados.add(nota2);
        listalunosaprovados.add(nota3);


        for (Float notaluno:listalunosaprovados){

            if ( notaluno >= 6){
                System.out.println("essas são as notas dos alunos aprovados " + notaluno); 
            }
        }


    }

}
