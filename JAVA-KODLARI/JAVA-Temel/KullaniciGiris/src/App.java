import java.util.Scanner; // Bu satır, kullanıcıdan veri girdisi almak için gerekli olan Scanner sınıfını programa dahil eder.

public class App { // Bu satır, "KullaniciGiris" adında bir sınıf tanımlar. Sınıflar, Java'daki kodun temel yapı taşlarıdır.

    public static void main(String[] args) throws Exception { // Bu satır, programın başlangıç noktası olan "main" metodunu tanımlar. "static" anahtar kelimesi, metodun sınıfın nesneleri oluşturulmadan çağrılabilmesine izin verir. "String[] args" ise komut satırından gelen argümanları tutan bir diziyi temsil eder. "throws Exception" ise programın çalışması sırasında herhangi bir hata oluşabileceğini belirtir.

        Scanner scanner = new Scanner(System.in); // Bu satır, kullanıcıdan veri girdisi almak için bir "Scanner" nesnesi oluşturur ve onu "scanner" değişkenine atar.

        String kullaniciAdi, sifre, yeniSifre, secim; // Bu satır, programda kullanılacak dört değişkeni tanımlar. Hepsi "String" tipindedir, yani metin saklayabilirler.

        System.out.println("Lutfen kullanıcı adınızı giriniz:"); // Bu satır, kullanıcıdan kullanıcı adını girmesini ister.
        kullaniciAdi = scanner.nextLine(); // Girilen değeri "kullaniciAdi" değişkenine atar.

        System.out.println("Lutfen parolanızı giriniz:"); // Bu satır, kullanıcıdan şifresini girmesini ister.
        sifre = scanner.nextLine(); // Girilen değeri "sifre" değişkenine atar.

        if (sifre.equals("patika")) { // Bu "if" koşulu, girilen şifrenin "patika" ile eşleşip eşleşmediğini kontrol eder.
            System.out.println("Giriş Başarılı"); // Eşleşirse "Giriş Başarılı" mesajı yazdırılır.
        } else { // Eşleşmezse, program aşağıdaki kod bloğuna geçer.
            System.out.println("Yanlış giriş yaptınız:"); // Kullanıcıya şifresinin yanlış olduğunu belirtir.
            System.out.println("Şifrenizi değiştirmek ister misiniz? - Evet ise 1, Hayır ise 2 ye basınız:"); // Kullanıcıdan şifresini değiştirmek isteyip istemediğini sorar.
            secim = scanner.nextLine(); // Kullanıcının seçimini "secim" değişkenine atar.

            if (secim.equals("1")) { // Kullanıcı şifresini değiştirmek istiyorsa, bu kod bloğu devreye girer.
                System.out.println("Lutfen yeni şifrenizi giriniz:"); // Kullanıcıdan yeni şifresini girmesini ister.
                yeniSifre = scanner.nextLine(); // Girilen değeri "yeniSifre" değişkenine atar.

                if (yeniSifre.equals(sifre)) { // Yeni şifre eski şifreyle aynıysa hata mesajı gösterir.
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz");
                } else { // Yeni şifre eski şifreyle aynı değilse, yeni şifreyi "sifre" değişkenine atar ve "Şifreniz değiştirildi" mesajını gösterir.
                    sifre = yeniSifre;
                    System.out.println("Şifreniz başarıyla değiştirildi");
                }
            }
        }
    }
}
