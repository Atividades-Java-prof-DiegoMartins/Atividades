import java.util.Scanner;

public class aula_15_abril {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o primeiro número");
    int primnum = sc.nextInt();
    System.out.println("Informe o segundo número");
    int segundnum = sc.nextInt();
    if (primnum > segundnum){
        System.out.println(primnum + "é maior que " + segundnum);
    }else if (segundnum > primnum){
        System.out.println(segundnum + "é maior que " + primnum);
    } else{System.out.println ("Os números " + primnum + " e " + segundnum + "são iguais ");}
}
    
}
