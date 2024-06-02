import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Bir değişken tanımlıyoruz
        int year;

        // Scanner sınıfı ile kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl girmesini istiyoruz
        System.out.println("Bir yıl giriniz : ");
        year = scanner.nextInt(); // Kullanıcının girdiği yılı alıyoruz

        // Artık yıl kontrolü başlıyor
        // Eğer yıl 4'e tam bölünüyorsa
        if(year % 4 == 0) {

            // Eğer yıl 100'e de tam bölünüyorsa
            if(year % 100 == 0) { 

                // Eğer yıl aynı zamanda 400'e de tam bölünüyorsa
                if(year % 400 == 0) {
                    // Yıl hem 4'e hem 100'e hem de 400'e bölünebiliyorsa artık yıldır
                    System.out.println("Girdiğiniz Yıl Artık Yıldır = " + year);
                } else {
                    // Yıl 100'e bölünüyor ama 400'e bölünmüyorsa artık yıl değildir
                    System.out.println("Girdiğiniz yıl bir artık yıl değildir " + year);
                }

            } else {
                // Yıl 4'e bölünüyor ve 100'e bölünmüyorsa artık yıldır
                System.out.println("Girdiğiniz yıl bir artık yıldır : " + year);
            }

        } else {
            // Yıl 4'e bölünmüyorsa artık yıl değildir
            System.out.println("Girdiğiniz yıl artık yıl değildir = " + year);
        }

        // Scanner nesnesini kapatıyoruz
        scanner.close();
    }
}
