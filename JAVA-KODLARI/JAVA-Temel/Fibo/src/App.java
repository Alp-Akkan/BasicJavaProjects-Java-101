// Gerekli Scanner sınıfını import ediyoruz
import java.util.Scanner;

// Ana sınıfımız App olarak adlandırılmış
public class App {
    // Ana metod olan main metodu burada başlıyor
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için Scanner sınıfından bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Fibonacci serisi için gerekli değişkenleri tanımlıyoruz
        int n1 = 0; // Fibonacci serisinin ilk sayısı
        int n2 = 1; // Fibonacci serisinin ikinci sayısı
        int n3; // Fibonacci serisinin sonraki sayısını tutacak değişken
        int i; // Döngü sayacı
        int n; // Kullanıcının gireceği sayıyı tutacak değişken
        
        // Kullanıcıdan N sayısını girmesini istiyoruz
        System.out.println("Lutfen N sayısını giriniz:");
        n = scanner.nextInt(); // Kullanıcının girdiği sayıyı değişkene atıyoruz

        // İlk iki Fibonacci sayısını ekrana yazdırıyoruz
        System.out.println(n1 + " " + n2);

        // Fibonacci serisini hesaplamak için döngü kullanıyoruz
        for (i = 2; i < n; i++) {
            n3 = n1 + n2; // Yeni Fibonacci sayısını hesaplıyoruz
            System.out.println("" + n3); // Hesaplanan sayıyı ekrana yazdırıyoruz
            n1 = n2; // Birinci sayıyı güncelliyoruz
            n2 = n3; // İkinci sayıyı güncelliyoruz
        }

        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
