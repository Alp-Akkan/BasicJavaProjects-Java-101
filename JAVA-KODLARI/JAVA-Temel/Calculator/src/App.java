
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int option;
        int sonuc;

        System.out.println("Lutfen yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1- toplama");
        System.out.println("2- çıkarma");
        System.out.println("3 - Bölme");
        System.out.println("4- çarpma");

        option = scanner.nextInt();
        System.out.println("Lutfen ilk sayıyı giriniz:");
        a = scanner.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz:");
        b=scanner.nextInt();
        switch (option) {
            case 1:
            sonuc = a+b;
                System.out.println("Toplama işleminin sonucu" + sonuc);
                
                break;
                case 2:
                    sonuc = a-b;
                    System.out.println("Çıkarma işleminin sonucu :" + sonuc);
                    break;
                    case 3:
                    sonuc = a/b;
                        System.out.println("bölme işleminin sonucu : " + sonuc);
                        break;
                        case 4:
                            sonuc=a*b;
                            System.out.println("Çarpma işleminin sonucu : " + sonuc);
                            break;
            default:
            System.out.println("Yanlış bir sayı seçtiniz:");
            break;
        }

        


    }
}
