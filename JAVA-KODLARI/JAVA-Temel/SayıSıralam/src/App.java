import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç adet sayı isteniyor
        System.out.println("Lütfen ilk sayınızı giriniz:");
        a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        c = scanner.nextInt();

        // İlk sayının en küçük olduğu durumu kontrol et
        if (a <= b && a <= c) {
            // a en küçükse, b ve c arasındaki durumu kontrol et
            if (b <= c) {
                System.out.println("Sıralama: " + a + " < " + b + " < " + c);
            } else {
                System.out.println("Sıralama: " + a + " < " + c + " < " + b);
            }
        } 
        // İkinci sayının en küçük olduğu durumu kontrol et
        else if (b <= a && b <= c) {
            // b en küçükse, a ve c arasındaki durumu kontrol et
            if (a <= c) {
                System.out.println("Sıralama: " + b + " < " + a + " < " + c);
            } else {
                System.out.println("Sıralama: " + b + " < " + c + " < " + a);
            }
        } 
        // Üçüncü sayının en küçük olduğu durumu kontrol et
        else {
            // c en küçükse, a ve b arasındaki durumu kontrol et
            if (a <= b) {
                System.out.println("Sıralama: " + c + " < " + a + " < " + b);
            } else {
                System.out.println("Sıralama: " + c + " < " + b + " < " + a);
            }
        }
    }
}
