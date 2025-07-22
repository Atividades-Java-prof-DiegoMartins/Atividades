import java.util.Scanner;
public class passei_ano {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota do primeiro bimestre: ");
        int bimestreum = sc.nextInt();
        System.out.println("Informe a nota do segundo bimestre: ");
        int bimestredois = sc.nextInt();
        System.out.println("Informe a nota do terceiro bimestre: ");
        int bimestretres = sc.nextInt();
        System.out.println("Informe a nota do quarto bimestre: ");

        int bimestrequatro = sc.nextInt();
        int mediabimestre = bimestreum + bimestredois + bimestretres + bimestrequatro;

        if((bimestreum, bimestredois, bimestretres, bimestrequatro >= 6) && (mediabimestre > 26)){
            System.out.println("Passou");}   
        else if (bimestretres < 6 && mediabimestre < 26 ){
        System.out.println("NÃO Passou");}   
        else if (bimestres < 6 && mediabimestre > 26 ){
        System.out.println("NÃO Passou");






    }
    
}
