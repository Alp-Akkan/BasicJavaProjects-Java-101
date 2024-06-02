import java.util.Arrays; // Arrays sınıfını kullanabilmek için import edildi
import java.util.Scanner; // Scanner sınıfını kullanabilmek için import edildi

public class App {
    public static void main(String[] args) throws Exception {
        int num; // Dizinin boyutunu tutacak değişken
        int value; // Kullanıcının girdiği değeri tutacak değişken
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuldu
        
        // Kullanıcıdan dizinin boyutunu girmesi istendi
        System.out.println("Dizinin boyutu: ");
        num = scanner.nextInt(); // Kullanıcıdan dizinin boyutu alındı
        int[] arr = new int[num]; // Girilen boyutta bir dizi oluşturuldu

        // Kullanıcıdan dizinin elemanlarını girmesi istendi
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". eleman: ");
            value = scanner.nextInt(); // Kullanıcının girdiği değer alındı
            arr[i] = value; // Değer diziye atandı
        }
        
        scanner.close(); // Scanner kapatıldı
        
        // Girilen diziyi ekrana yazdır
        System.out.println("*****************************");
        System.out.println(Arrays.toString(arr)); // Diziyi ekrana yazdır
        System.out.println("*****************************");
        
        // Diziyi sıralar ve sıralı diziyi ekrana yazdırır
        System.out.println("Sıralanan: ");
        Arrays.sort(arr); // Dizi sıralandı
        System.out.println(Arrays.toString(arr)); // Sıralanan dizi ekrana yazdırıldı
    }
}
