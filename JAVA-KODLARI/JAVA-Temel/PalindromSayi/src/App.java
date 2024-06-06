import java.util.Scanner;

public class App {
    // static bir metot isPalindrom, parametre olarak bir int sayı alır ve boolean döndürür
    static boolean isPalindrom(int number) {
        int temp = number; // number değişkeninin değerini temp değişkenine atıyoruz
        int reversenumber = 0; // ters çevrilmiş sayıyı tutmak için bir değişken tanımlıyoruz
        int lastNumber; // son basamağı tutacak değişken

        // temp sıfır olmadığı sürece döngü devam eder
        while (temp != 0) {
            lastNumber = temp % 10; // son basamağı alıyoruz
            reversenumber = (reversenumber * 10) + lastNumber; // ters çevrilmiş sayıyı güncelliyoruz
            temp /= 10; // temp değişkenini 10'a bölerek son basamağı çıkartıyoruz
        }

        // orijinal sayı ile ters çevrilmiş sayıyı karşılaştırıyoruz
        if (number == reversenumber) {
            System.out.println("Sayı palindrom sayıdır.");
        } else {
            System.out.println("Sayı palindrom sayı değildir.");
        }

        return true; // her zaman true döndürür, bu mantıksal olarak doğru değil ama metot bir değer döndürmek zorunda
    }

    // Ana metot main burada başlıyor
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için Scanner sınıfından bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.println("Sayı giriniz:");
        int num;
        // Kullanıcının girdiği sayıyı num değişkenine atıyoruz
        num = scanner.nextInt();

        // isPalindrom metodunu çağırıyoruz ve sonucu ekrana yazdırıyoruz
        isPalindrom(num);

        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
