
import java.util.Scanner;






public class App {
    public static void main(String[] args) throws Exception {

        int number ; 
        int j =0;
        int  toplam =0 ;
        int ortalama =0;


Scanner scanner = new Scanner(System.in);
System.out.println("Lutfen sayiyi giriniz:");
number = scanner.nextInt();

for (int i = 0 ; i <= number ;i++)
{
    if(i %3 ==0 && i % 4 ==0)
    {
        System.out.println(i);
        j++;
        toplam = toplam+i;
    }

}
    ortalama = toplam / j;
     System.out.println("SAyıların ortalaması"+ortalama);






    }
}
