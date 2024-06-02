import java.util.Scanner; // Scanner sınıfını kullanabilmek için import edildi

public class App {

    public static void main(String[] args) throws Exception {
        int number ; // Kullanıcıdan alınacak sayıyı tutmak için değişken tanımlandı
        int toplam = 0; // Çift sayıların toplamını tutmak için değişken tanımlandı
        int ortalama = 0 ; // Çift sayıların ortalamasını tutmak için değişken tanımlandı
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuldu

        System.out.println("Lutfen Bir sayı giriniz :"); // Kullanıcıya bir sayı girmesi istendi

        number = scanner.nextInt(); // Kullanıcının girdiği sayı alındı

        System.out.println("Girdiğin Sayıya kadar olan çift sayılar  ="); // Ekrana çift sayılar yazdırılmadan önce bir mesaj gösterildi

        for (int i = 1 ; i <= number ; i++) // Girilen sayıya kadar olan sayıları kontrol eden döngü başlatıldı
        {
            if(i% 2 ==0 ) // Eğer sayı çiftse
            System.out.println(i); // Sayı ekrana yazdırıldı
        }
    }
}
