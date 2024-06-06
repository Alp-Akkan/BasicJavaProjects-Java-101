// Gerekli Scanner sınıfını import ediyoruz
import java.util.Scanner;

// Ana sınıfımız App olarak adlandırılmış
public class App {
    // Ana metod olan main metodu burada başlıyor
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için Scanner sınıfından bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);
        int n ; // Kullanıcının gireceği sayıyı tutacak değişken

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.println("Lutfen bir sayı giriniz:");
        // Kullanıcının girdiği sayıyı değişkene atıyoruz
        n = scanner.nextInt();

        // Dış döngü: n'den başlayarak 1'e kadar geriye doğru iterasyon yapar
        for(int i = n ; i > 0 ; i--) {
            // İç döngü 1: (n-i) adet boşluk basar
            for(int j = (n-i) ; j > 0 ; j--) {
                System.out.print(" "); // Boşluk karakteri basılıyor
            }
            // İç döngü 2: (2*i - 2) adet yıldız basar
            for(int k = (2*i - 2); k >= 0 ; k--) {
                System.out.print("*"); // Yıldız karakteri basılıyor
            }
            // Her satırın sonunda yeni bir satıra geçmek için println kullanıyoruz
            System.out.println(" ");
        }

        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
