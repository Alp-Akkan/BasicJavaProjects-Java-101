import java.util.Arrays; // Arrays sınıfını içe aktarır, dizi işlemleri için kullanılır.
import java.util.Random; // Random sınıfını içe aktarır, rastgele sayı üretimi için kullanılır.
import java.util.Scanner; // Scanner sınıfını içe aktarır, kullanıcıdan giriş almak için kullanılır.

// Pratik - Sayı Tahmin Oyunu
public class App
{
    public static void main(String[] args) {

        Random rand = new Random(); // Rastgele sayı üretmek için Random nesnesi oluşturulur.
        int number = rand.nextInt(100); // 0-99 arasında rastgele bir sayı seçilir.
        // int number = (int) (Math.random() * 100); // Alternatif rastgele sayı üretimi.

        Scanner input = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturulur.
        int right = 0; // Kullanıcının tahmin hakkını takip eder.
        int selected; // Kullanıcının tahminini saklar.
        int[] wrong = new int[5]; // Hatalı tahminleri saklamak için dizi.
        boolean isWin = false; // Oyunun kazanılıp kazanılmadığını takip eder.
        boolean isWrong = false; // Kullanıcının hatalı giriş yapıp yapmadığını takip eder.

        System.out.println(number); // Rastgele seçilen sayı (gizli sayı) konsola yazdırılır (debugging için).
        while (right < 5) { // Kullanıcının 5 hakka kadar tahmin yapmasına izin verir.
            System.out.print("Lütfen tahmininizi giriniz : "); // Kullanıcıdan tahmin ister.
            selected = input.nextInt(); // Kullanıcının tahmini alınır.

            if (selected < 0 || selected > 99) { // Tahminin 0-99 aralığında olup olmadığı kontrol edilir.
                System.out.println("Lütfen 0-100 arasında bir değer giriniz."); // Hatalı giriş mesajı.
                if (isWrong) { // Eğer kullanıcı daha önce hatalı giriş yapmışsa.
                    right++; // Hakkı azaltılır.
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right)); // Kalan hak mesajı.
                } else {
                    isWrong = true; // İlk hatalı giriş.
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir."); // Uyarı mesajı.
                }
                continue; // Döngünün başına dönülür.
            }

            if (selected == number) { // Eğer kullanıcı doğru tahmin yapmışsa.
                System.out.println("---------------------------------------------");
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number); // Tebrik mesajı.
                isWin = true; // Kazanma durumu güncellenir.
                break; // Döngüden çıkılır.
            } else { // Hatalı tahmin durumu.
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) { // Tahmin edilen sayı gizli sayıdan büyükse.
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else { // Tahmin edilen sayı gizli sayıdan küçükse.
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected; // Hatalı tahmin diziye eklenir ve hak azaltılır.
                System.out.println("Kalan hakkı : " + (5 - right)); // Kalan hak mesajı.
            }
        }

        if (!isWin) { // Eğer kullanıcı oyunu kazanamamışsa.
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) { // Eğer kullanıcı hatalı giriş yapmamışsa.
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong)); // Hatalı tahminler gösterilir.
            }
        }
    }
}
