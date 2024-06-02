import java.util.Scanner; // Scanner sınıfını kullanabilmek için import edildi

public class App {
    public static void main(String[] args) throws Exception {
        final double pi = 3.14; // Pi sayısı sabit olarak tanımlandı
        double acı = 0; // Merkez açı değişkeni tanımlandı
        double r = 0; // Yarıçap değişkeni tanımlandı
        double alan = 0; // Dairenin alanı için değişken tanımlandı
        double cevre = 0; // Dairenin çevresi için değişken tanımlandı

        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuldu

        // Kullanıcıdan yarıçap bilgisi alındı
        System.out.println("Yarı çapı giriniz : ");
        r = scanner.nextDouble();

        // Kullanıcıdan merkez açı bilgisi alındı
        System.out.println("Merkez açıyı giriniz:");
        acı = scanner.nextDouble();

        scanner.close(); // Scanner kaynağı kapatıldı

        // Dairenin alanı hesaplandı
        alan = pi * r * r;

        // Dairenin çevresi hesaplandı
        cevre = 2 * pi * r;

        // Alan ve çevre sonuçları ekrana yazdırıldı
        System.out.println("Alan = " + alan);
        System.out.println("Cevre = " + cevre);
    }
}
