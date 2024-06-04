import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int sicaklik ;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Lutfen sıcaklık değerini giriniz:");
    sicaklik = scanner.nextInt();

    if(sicaklik<5)
    {
        System.out.println("Kayak Yap : ");


    }
    else if(sicaklik>=5 && sicaklik<15)
    {
        System.out.println("Sinemaya git");
    }
    else if(sicaklik>=15 && sicaklik<25)
    {
        System.out.println("Piknik yap");
    }
    else if(sicaklik>25)
    {
        System.out.println("Yüzmeye Git");
    }


    scanner.close();    
    }
}
