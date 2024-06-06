import java.util.Scanner;

public class App {
    // Recursive metot: Bir sayının asal olup olmadığını kontrol eder
    static int asal(int num, int i) {
        if (num <= 1) {
            return 0; // 1 ve negatif sayılar asal değil
        } 
        if (i >= num) {
            return 1; // Bölen sayı num'dan büyük veya eşitse, num asaldır
        } 
        if (num % i == 0) {
            return 0; // Bölen bulunduğunda, asal değil
        } 
        return asal(num, i + 1); // Bir sonraki böleni kontrol etmek için metodu tekrar çağır
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int i = 2; // Bölen
        System.out.println("Lütfen bir sayı giriniz:");
        num = scanner.nextInt();

        // asal metodu çağrılarak sayının asal olup olmadığı kontrol edilir
        if (asal(num, i) == 1) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}
