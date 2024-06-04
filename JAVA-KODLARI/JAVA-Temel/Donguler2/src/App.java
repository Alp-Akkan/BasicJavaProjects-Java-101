import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Kullanıcıdan bir sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen sayıdan küçük ikinin kuvvetlerini bulan program.");
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scanner.nextInt();

        // Girilen sayıya kadar 2'nin kuvvetlerini yazdırıyoruz
        System.out.println("Girilen sayının 2 nin kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 2) {
            System.out.println(i);
        }

        // Girilen sayıya kadar 4'ün kuvvetlerini yazdırıyoruz
        System.out.println("Girilen sayının 4 ün kuvvetleri");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        // Girilen sayıya kadar 5'in kuvvetlerini yazdırıyoruz
        System.out.println("Girilen sayının 5 in kuvvetleri");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }
    }
}
