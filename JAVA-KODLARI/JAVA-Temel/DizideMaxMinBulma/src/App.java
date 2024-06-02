import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Bir dizi tanımlanıyor ve bazı tamsayı değerleri atanıyor
        int[] list2 = {15, 65, 32, 1, -1, -778, 2, 0, 6};

        // Dizinin içeriği ekrana yazdırılıyor
        System.out.println(Arrays.toString(list2));

        // Kullanıcıdan bir sayı almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcının girdiği sayı okunuyor
        int num = scanner.nextInt();

        // En küçük ve en büyük değerler için başlangıç değerleri atanıyor
        int min1 = list2[0];
        int max2 = list2[0];

        // Dizideki en küçük ve en büyük değerleri bulmak için döngü
        for (int j : list2) {
            if (j < min1) {
                min1 = j; // En küçük değer güncelleniyor
            } else if (j > max2) {
                max2 = j; // En büyük değer güncelleniyor
            }
        }

        // Kullanıcının girdiği sayıdan büyük ve küçük en yakın değerleri bulmak için döngü
        for (int j : list2) {
            if (j > num) {
                if (j < max2) {
                    max2 = j; // En yakın büyük değer güncelleniyor
                }
            }
            if (j < num) {
                if (j > min1) {
                    min1 = j; // En yakın küçük değer güncelleniyor
                }
            }
        }

        // En yakın küçük ve büyük değerler ekrana yazdırılıyor
        System.out.println("Girilen sayıdan küçük en yakın değer: " + min1);
        System.out.println("Girilen sayıdan büyük en yakın değer: " + max2);

        // Scanner nesnesi kapatılıyor
        scanner.close();
    }
}
