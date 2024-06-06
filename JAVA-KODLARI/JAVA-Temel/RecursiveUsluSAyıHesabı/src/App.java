import java.util.Scanner;

public class App {
    static int usBulma(int base , int power)
    {
        if(power != 0)
        {
            return base*usBulma(base, power-1);

        }
        else
        {
            return 1 ;
        }



    }



    public static void main(String[] args) throws Exception {

        System.out.println("Recursive ile üs bulma ");
        Scanner scanner = new Scanner(System.in);
        int taban , us;
        System.out.println("Lutfen tabanı giriniz:");
        taban = scanner.nextInt();
        
        System.out.println("Lutfen ussu giriniz:");
        us = scanner.nextInt();

        System.out.println("Sonuç :  " +usBulma(taban, us));
        



    }
}
