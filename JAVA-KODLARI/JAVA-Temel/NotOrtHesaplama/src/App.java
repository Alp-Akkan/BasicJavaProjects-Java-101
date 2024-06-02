import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Değişkenleri tanımlayın
        int mat;        // Matematik notunu tutacak değişken
        int fizik;      // Fizik notunu tutacak değişken
        int kimya;      // Kimya notunu tutacak değişken
        int turkce;     // Türkçe notunu tutacak değişken
        int tarih;      // Tarih notunu tutacak değişken
        int muzik;      // Müzik notunu tutacak değişken
        int ort;        // Not ortalamasını tutacak değişken

        // Kullanıcıdan veri almak için bir Scanner nesnesi oluşturun
        Scanner scanner = new Scanner(System.in);

        // Matematik notunu alın ve maksimum 100 puanla sınırlayın
        System.out.println("Lütfen Matematik notunuzu giriniz:");
        mat = scanner.nextInt();
        mat = (mat > 100) ? 100 : mat;

        // Fizik notunu alın ve maksimum 100 puanla sınırlayın
        System.out.println("Lütfen Fizik notunuzu giriniz:");
        fizik = scanner.nextInt();
        fizik = (fizik > 100) ? 100 : fizik;

        // Kimya notunu alın ve maksimum 100 puanla sınırlayın
        System.out.println("Lütfen Kimya notunuzu giriniz:");
        kimya = scanner.nextInt();
        kimya = (kimya > 100) ? 100 : kimya;

        // Türkçe notunu alın ve maksimum 100 puanla sınırlayın
        System.out.println("Lütfen Türkçe notunuzu giriniz:");
        turkce = scanner.nextInt();
        turkce = (turkce > 100) ? 100 : turkce;

        // Tarih notunu alın ve maksimum 100 puanla sınırlayın
        System.out.println("Lütfen Tarih notunuzu giriniz:");
        tarih = scanner.nextInt();
        tarih = (tarih > 100) ? 100 : tarih;

        // Müzik notunu alın ve maksimum 100 puanla sınırlayın
        System.out.println("Lütfen Müzik notunuzu giriniz:");
        muzik = scanner.nextInt();
        muzik = (muzik > 100) ? 100 : muzik;

        // Scanner nesnesini kapatın
        scanner.close();

        // Notların ortalamasını hesaplayın
        ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        
        // Kullanıcıya not ortalamsını bildirin
        System.out.println("Not ortalamanız = " + ort);

        // Ortalama 60'tan büyükse geçme durumunu kontrol edin
        if (ort > 60) {
            System.out.println("Sınıfı geçtiniz.");

        } else {
            System.out.println("Başarısız oldunuz.");
        }
    }
}
