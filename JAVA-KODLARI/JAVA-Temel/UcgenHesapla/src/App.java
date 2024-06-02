import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int a;
    int b;
    int c;
    double u;
    double alan;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Üççgenin ilk kenarını giriniz: ");
    a = scanner.nextInt();
    System.out.println("Üçgenin ikinci kenarını giriniz: ");
    b = scanner.nextInt();
    System.out.println("üçgenin 3 . kenarını giriniz :");
    c=scanner.nextInt();

        scanner.close();


        u = (a+b+c)/2;
        alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Çevresi" + 2*u);
        System.out.println("üçgenin alanı " + alan);

    
    

    }
}
