import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    int sayi ; 
    int toplam =0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Lutfen SAyı giriniz:");
    sayi= scanner.nextInt();

        for (int i = 1 ; i <sayi ; i++)
        {
            if(sayi%i ==0)
            {
                toplam+=i;

            }
        }
        if(toplam == sayi)
        {
            System.out.println("Mukemmel sayidir");
        }
        else
        {
            System.out.println("Mukemmel sayı değildir.");
        }



    }
}
