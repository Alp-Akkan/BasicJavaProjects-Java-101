import java.util.Scanner; // Scanner sınıfını kullanabilmek için import edildi

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Doğum yılınıza göre Çin zodyağında Hangi Canlısınız ?");
        
        int birthYear ; // Kullanıcıdan alınacak doğum yılını tutmak için değişken tanımlandı
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuldu

        System.out.println("Lutfen Doğum yılınızı giriniz :"); // Kullanıcıya doğum yılını girmesi istendi

        birthYear = scanner.nextInt(); // Kullanıcının girdiği doğum yılı alındı
        System.out.println("Doğum yılınıza Göre Çin zodyağında = "); // Doğum yılına göre Çin zodyağı canlısını belirtmek için bir mesaj gösterildi

        switch (birthYear% 12) { // Doğum yılına göre Çin zodyağı hesaplandı
            case 0 :
                System.out.println("Maymun");
                break;
            case 1 :
                System.out.println("Horoz");
                break ;
            case 2 :
                System.out.println("Köpek");
                break;
            case 3 :
                System.out.println("Domuz");
                break;
            case 4 :
                System.out.println("Fare");
                break;
            case 5 :
                System.out.println("Öküz");
                break;
            case 6 :
                System.out.println("Kaplan");
                break;
            case 7 :
                System.out.println("Tavşan");
                break;
            case 8 :
                System.out.println("Ejderha");
                break;
            case 9 :
                System.out.println("Yılan");
                break;
            case 10 :
                System.out.println("At");
                break;
            case 11 :
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız:"); // Geçersiz bir doğum yılı girdiğinde kullanıcıya hata mesajı gösterildi
                break;
        }
    }
}
