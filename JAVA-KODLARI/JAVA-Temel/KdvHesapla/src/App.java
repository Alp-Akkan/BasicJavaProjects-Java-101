import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Değişkenleri tanımlayın
        double tutar;  // Toplam tutarı tutacak değişken
        double kdv;    // KDV tutarını tutacak değişken
        double miktar; // Kullanıcının girdiği miktarı tutacak değişken

        // Kullanıcıdan miktarı girmesini isteyin
        System.out.println("Lütfen miktarı giriniz: ");
        miktar = scanner.nextDouble();

        // Scanner nesnesini kapatın
        scanner.close();

        // KDV oranını belirlemek için miktara göre koşulları kontrol edin
        if (miktar <= 1000 && miktar > 0) {
            // Miktar 0 ile 1000 arasında ise KDV oranı %18
            kdv = miktar * 0.18;
            tutar = miktar + kdv;
        } else {
            // Miktar 1000'den büyükse KDV oranı %8
            kdv = miktar * 0.08;
            tutar = kdv + miktar;
        }

        // Kullanıcıya ödemesi gereken miktarı, KDV miktarını ve toplam tutarı bildirin
        System.out.println("Ödemeniz gereken miktar: " + miktar + "  KDV miktarı: " + kdv + "  Toplam: " + tutar);
    }
}
