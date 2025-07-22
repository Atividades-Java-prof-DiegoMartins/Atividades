    import java.util.Scanner;
    public class Main {
        public static void main(String[] args){
            System.out.println("Informe o nome da rua em que você mora");
            String adress = new Scanner(System.in).nextLine();
            System.out.println("Informe o número da sua casa ");
            String numberhouse = new Scanner (System.in).nextLine();
            System.out.println("Informe o bairro ");
            String bairro = new Scanner (System.in).nextLine();
            System.out.println("Informa a sua cidade");
            String city = new Scanner(System.in).nextLine();
            System.out.println("Informe o seu cep ");
            String cephouse = new Scanner(System.in).nextLine();
            System.out.println("R." + adress + "," + numberhouse + " - " + bairro);
            System.out.println(city + ", " + cephouse);

        }
    }