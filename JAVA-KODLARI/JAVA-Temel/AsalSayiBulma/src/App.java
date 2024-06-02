import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcının gireceği sayıyı tutmak için bir değişken tanımlıyoruz
        int sayi;
        
        // Scanner sınıfı ile kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz
        System.out.println("Lütfen bir sayı giriniz: ");
        
        // Kullanıcının girdiği sayıyı alıyoruz
        sayi = scanner.nextInt();
        
        // Asal sayı olup olmadığını kontrol etmek için bir bayrak değişkeni tanımlıyoruz
        boolean asal = true;

        // Girilen sayının asal olup olmadığını kontrol ediyoruz
        if (sayi <= 1) {
            // 1 ve 1'den küçük sayılar asal değildir
            asal = false;
        } else {
            // 2'den başlayarak sayının kareköküne kadar olan sayılarla kontrol yapıyoruz
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                // Eğer sayı herhangi bir sayıya tam bölünüyorsa asal değildir
                if (sayi % i == 0) {
                    asal = false;
                    break; // Döngüyü sonlandırıyoruz çünkü artık sayının asal olmadığını biliyoruz
                }
            }
        }
        
        // Asal olup olmadığını kontrol ederek sonucu ekrana yazdırıyoruz
        if (asal) {
            System.out.println("Sayı asal sayıdır: " + sayi);
        } else {
            System.out.println("Sayı asal sayı değildir: " + sayi);
        }

        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
