import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int n;

    System.out.println("Lutfen bir sayı giriniz:");
    n=scanner.nextInt();

    for(int i = 0 ; i <= n ; i++)
    {
     for(int j = 0 ; j <(n-i) ;j++ )
     {
        System.out.print(" ");
     }   
     for(int k = 1 ; k<= (2*i)-1 ; k++ )
     {
        System.out.print("*");
     }

     System.out.println(" ");

    }
    



    }
}
