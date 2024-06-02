import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan doğum günü ve ayını almak için Scanner nesnesi oluşturulur.
        int day;
        int month;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya doğum gününü girmesi istenir.
        System.out.println("Lutfen Doğum gününü Giriniz =" );
        day = scanner.nextInt();
        // Kullanıcıya doğum ayını girmesi istenir.
        System.out.println("Lutfen Doğum ayınızı giriniz = ");
        month = scanner.nextInt();
        System.out.println("***********************************");

        // Girilen tarihlerin burçlarına göre kontrol edilmesi.
        if(month == 3 && day >=21 || month == 4 && day <=20)
        {
            System.out.println("Koç burcusunuz ");
        }
        else if (month == 4 && day >= 21 || month == 5 && day <= 21)
        {
            System.out.println("Boğa burcusunuz");
        }
        else if (month == 5 && day >= 22 || month == 6 && day <= 22)
        {
            System.out.println("İkizler burcusunuz");
        }
        else if (month == 6 && day >= 23 || month == 7 && day <= 22)
        {
            System.out.println("Yengeç burcusunuz");
        }
        else if (month == 7 && day >= 23 || month == 8 && day <= 22)
        {
            System.out.println("Aslan burcusunuz");
        }
        else if (month == 8 && day >= 23 || month == 9 && day <= 22)
        {
            System.out.println("Başak burcusunuz");
        }
        else if (month == 9 && day >= 23 || month == 10 && day <= 22)
        {
            System.out.println("Terazi burcusunuz");
        }
        else if (month == 10 && day >= 23 || month == 11 && day <= 22)
        {
            System.out.println("Akrep burcusunuz");
        }
        else if (month == 11 && day >= 23 || month == 12 && day <= 21)
        {
            System.out.println("Yay burcusunuz");
        }
        else if (month == 12 && day >= 22 || month == 1 && day <= 21)
        {
            System.out.println("Oğlak burcusunuz");
        }
        else if (month == 1 && day >= 22 || month == 2 && day <= 19)
        {
            System.out.println("Kova burcusunuz");
        }
        else
        {
            System.out.println("Balık burcusunuz");
        }
        scanner.close();
    }
}
