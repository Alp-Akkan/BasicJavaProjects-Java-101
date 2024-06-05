import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int total =1;
    int n;
    int us;

    System.out.println("Lutfen sayıyı giriniz:");
    n=scanner.nextInt();
    System.out.println("Lutfen ussu giriniz:");
    us=scanner.nextInt();

    for(int i =1 ; i<=us ; i++)
    {
        total *=n;
    }

    System.out.println("Cevap: " + total);



    }
}
