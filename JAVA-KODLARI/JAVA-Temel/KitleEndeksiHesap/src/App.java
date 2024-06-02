import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        double Boy ;
        double kilo;
        double index;

        System.out.println("Boyunuzu giriniz :");
        Boy = scanner.nextDouble();
        System.out.println("Kilonuuz giriniz:");
        kilo = scanner.nextDouble();


        index = kilo/ (Boy*Boy);

        System.out.println("Vücut kitle index sonucuunuz : " + index);





    }
}
