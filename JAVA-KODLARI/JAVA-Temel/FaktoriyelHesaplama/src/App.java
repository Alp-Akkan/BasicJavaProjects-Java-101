import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
    int n, r, nR;
    int nfact =1;
    int rfact = 1;
    int nRfact =1;
    int total =1 ;
    
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(" N kombinasyonu için bir rakam ");
    n= scanner.nextInt();
    System.out.println("r Kombinasyonu için bir rakam giriniz:");
    r = scanner.nextInt();

    scanner.close();

    nR=n-r;
    for (int i =1 ; i<=n ; i++)
    {
        nfact=nfact*i;

    }
    for(int i= 1 ; i <= r; i++)
    {
        rfact=rfact*i;

    }

    for(int i = 1 ; i <= nR;i++)
    {
        nRfact=nRfact*i;

    }

    total=nfact/(rfact*(nRfact));

    
    System.out.println("factorial" + total);




    }
}
