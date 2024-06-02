import java.util.Scanner; // Scanner sınıfını kullanabilmek için import edildi

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuldu

        double km = 2.20; // Kilometre başına ücret
        double mesafe; // Kullanıcıdan alınacak mesafe
        double minimumUcret = 10.0; // Minimum ücret
        double ucret; // Hesaplanan ücret

        // Kullanıcıdan mesafeyi girmesi istendi
        System.out.println("Mesafeyi giriniz: ");
        mesafe = scanner.nextDouble(); // Kullanıcıdan mesafe alındı

        scanner.close(); // Scanner kapatıldı

        // Ücret hesaplandı: minimum ücret + mesafe * kilometre başına ücret
        ucret = minimumUcret + mesafe * km;

        // Eğer hesaplanan ücret 20'den küçük veya eşitse, ücret 20 olarak ayarlanır
        if (ucret <= 20) {
            ucret = 20;
        }

        // Ücret ekrana yazdırıldı
        System.out.println("Ücretiniz: " + ucret);
    }
}
