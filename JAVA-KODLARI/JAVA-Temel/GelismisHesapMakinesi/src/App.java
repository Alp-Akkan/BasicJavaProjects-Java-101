import java.util.Scanner;

// Gelişmiş Hesap Makinesi
public class App {
    
    // Toplama işlemi
    static void plus() {
        int result = 0, num; // Sonuç ve kullanıcıdan alınacak sayılar
        Scanner scan = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Kaç sayı toplayacaksınız: ");
        int counter = scan.nextInt(); // Kaç sayı toplanacağı bilgisi

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt(); // Kullanıcıdan sayı al
            result += num; // Sayıları toplama işlemi
        }
        System.out.println("Toplam: " + result); // Toplam sonucu ekrana yazdır
    }

    // Çıkarma işlemi
    static void minus() {
        int result = 0, num; // Sonuç ve kullanıcıdan alınacak sayılar
        Scanner scan = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = scan.nextInt(); // Kaç sayı çıkarılacağı bilgisi

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt(); // Kullanıcıdan sayı al
            if (i == 1) {
                result += num; // İlk sayıyı direk ekle
                continue;
            }
            result -= num; // Sonraki sayıları çıkar
        }
        System.out.println("Sonuç: " + result); // Çıkarma sonucu ekrana yazdır
    }

    // Çarpma işlemi
    static void multiply() {
        int result = 1, num; // Sonuç ve kullanıcıdan alınacak sayılar
        Scanner scan = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = scan.nextInt(); // Kaç sayı çarpılacağı bilgisi

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt(); // Kullanıcıdan sayı al
            if (num == 0) {
                result = 0; // Eğer sayı 0 ise sonuç 0 olur ve döngü sonlanır
                break;
            }
            result *= num; // Sayıları çarpma işlemi
        }
        System.out.println("Sonuç: " + result); // Çarpma sonucu ekrana yazdır
    }

    // Bölme işlemi
    static void divide() {
        double result = 0.0, num; // Sonuç ve kullanıcıdan alınacak sayılar
        Scanner scan = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = scan.nextInt(); // Kaç sayı bölüneceği bilgisi

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt(); // Kullanıcıdan sayı al
            if (i != 1 && num == 0) {
                System.out.println("Bölen için 0 değerini giremezsiniz: ");
                continue; // Bölme işleminde bölen 0 olamaz
            }
            if (i == 1) {
                result = num; // İlk sayı bölünen olarak alınır
                continue;
            }
            result /= num; // Sayıları bölme işlemi
        }
        System.out.println("Sonuç: " + result); // Bölme sonucu ekrana yazdır
    }

    // Üs alma işlemi
    static void power() {
        int base, power, result = 1; // Taban, üs ve sonuç değişkenleri
        Scanner scan = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Taban değerini giriniz: ");
        base = scan.nextInt(); // Taban değeri al
        System.out.print("Üs değerini giriniz: ");
        power = scan.nextInt(); // Üs değeri al

        for (int i = 1; i <= power; i++) {
            result *= base; // Üs alma işlemi
        }
        System.out.println("Sonuç: " + result); // Üs alma sonucu ekrana yazdır
    }

    // Faktöriyel işlemi
    static void factorial() {
        Scanner input = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.println("Faktöriyel hesabı için sayı giriniz: ");
        int num = input.nextInt(); // Kullanıcıdan sayı al
        int result = 1; // Sonuç değişkeni

        for (int i = 1; i <= num; i++) {
            result *= i; // Faktöriyel hesaplama
        }
        System.out.println("Sonuç: " + result); // Faktöriyel sonucu ekrana yazdır
    }

    // Mod alma işlemi
    static void mod() {
        int result; // Sonuç değişkeni
        Scanner input = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Hangi sayının modunu almak istiyorsunuz?: ");
        int num = input.nextInt(); // Modu alınacak sayı
        System.out.print("Hangi sayıya göre mod almak istiyorsunuz?: ");
        int modNum = input.nextInt(); // Mod alınacak sayı

        if (num == 0 && modNum == 0) {
            System.out.println("Lütfen geçerli değerler giriniz: ");
        } else {
            result = num % modNum; // Mod alma işlemi
            System.out.println("Sonuç: " + result); // Mod sonucu ekrana yazdır
        }
    }

    // Dikdörtgen alan ve çevre hesabı
    static void rectangle() {
        int uzunKenar, kısaKenar, cevre, alan; // Uzun ve kısa kenar, çevre ve alan değişkenleri
        Scanner input = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        uzunKenar = input.nextInt(); // Uzun kenar değeri al
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        kısaKenar = input.nextInt(); // Kısa kenar değeri al

        cevre = (uzunKenar * 2) + (kısaKenar * 2); // Çevre hesaplama
        alan = uzunKenar * kısaKenar; // Alan hesaplama
        System.out.println("Çevre: " + cevre); // Çevre sonucu ekrana yazdır
        System.out.println("Alan: " + alan); // Alan sonucu ekrana yazdır
    }

    // Ana metot
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi
        int choice; // Kullanıcının menü seçimi
        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";

        do {
            System.out.print(menu); // Menü ekrana yazdırılır
           
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            choice = input.nextInt(); // Kullanıcının menü seçimi alınır

            switch (choice) {
                case 1:
                    plus(); // Toplama işlemi
                    break;
                case 2:
                    minus(); // Çıkarma işlemi
                    break;
                case 3:
                    multiply(); // Çarpma işlemi
                    break;
                case 4:
                    divide(); // Bölme işlemi
                    break;
                case 5:
                    power(); // Üs alma işlemi
                    break;
                case 6:
                    factorial(); // Faktöriyel hesaplama
                    break;
                case 7:
                    mod(); // Mod alma işlemi
                    break;
                case 8:
                    rectangle(); // Dikdörtgen alan ve çevre hesaplama
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Lütfen geçerli bir değer giriniz!"); // Geçersiz seçim uyarısı
                    }
            }
        } while (choice != 0); // Kullanıcı 0 seçeneğini seçene kadar döngü devam eder
    }
}
