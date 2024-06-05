import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double sonuc = 0.0;

        System.out.println("Lutfen bir sayı giriniz: ");

        int n = scanner.nextInt();
        
        // Harmonik seri hesaplama
        for (double i = 1; i <= n; i++) {
            sonuc += (1 / i);
        }

        System.out.println("Harmonik sayı sonucu: " + sonuc);

        // Scanner'ı kapatmayı unutmayalım
        scanner.close();
    }
}
