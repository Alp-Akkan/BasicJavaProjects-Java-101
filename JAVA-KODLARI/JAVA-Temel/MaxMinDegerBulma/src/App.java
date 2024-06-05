import java.util.ArrayList; // ArrayList sınıfını import ediyor
import java.util.Collections; // Collections sınıfını import ediyor
import java.util.List; // List arayüzünü import ediyor
import java.util.Scanner; // Scanner sınıfını import ediyor

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuluyor
        int n = 0; // Kaç sayı girileceğini tutacak değişken
        int value; // Kullanıcının girdiği sayıyı tutacak değişken

        List<Integer> list = new ArrayList<Integer>(); // Sayıları tutmak için bir ArrayList oluşturuluyor

        System.out.println("Sayı miktarını giriniz:"); // Kullanıcıya kaç sayı gireceğini soruyor
        n = scanner.nextInt(); // Kullanıcının girdiği sayı miktarını okuyor

        for (int i = 1; i <= n; i++) { // Girilecek sayı adedi kadar döngü çalıştırılıyor
            System.out.println("İlk sayıyı giriniz:"); // Kullanıcıdan bir sayı girmesini istiyor
            value = scanner.nextInt(); // Kullanıcının girdiği sayıyı okuyor

            list.add(value); // Girdiği sayıyı listeye ekliyor
        }

        Collections.sort(list); // Listeyi küçükten büyüğe sıralıyor

        // En büyük ve en küçük değeri ekrana yazdırıyor
        System.out.println("En büyük değer = " + list.get(n-1) + " En küçük değer = " + list.get(0));
    }
}
