import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int num;
    int toplam = 0;

    Scanner scanner = new Scanner(System.in);
    
    

    do { 
        System.out.println("Lutfen sayiyi giriniz:");

         num = scanner.nextInt();

        if(num %2 ==0 && num % 4 ==0)
        {
            toplam = toplam+num;

        }
       



        
    } while (num%2!=1);
    scanner.close();

        System.out.println("SAyiların toplamı " + toplam);


    }
}
