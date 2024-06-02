import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcı adı ve şifre değişkenlerini tanımlıyoruz
        String username;
        String password;

        // Scanner nesnesi oluşturarak kullanıcıdan giriş almak için kullanıyoruz
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcının kaç hakkı kaldığını ve başlangıç bakiyesini tanımlıyoruz
        int right = 3;
        int balance = 1500;
        int select ;

        // Kullanıcının giriş hakları bitene kadar döngü oluşturuyoruz
        while (right > 0) {
            // Kullanıcı adı ve şifre girişini istiyoruz
            System.out.println("Lutfen Kullancı adınızı giriniz: ");
            username = scanner.nextLine();
            System.out.println("Lutfen Parolanızı Giriniz :");
            password = scanner.nextLine();

            // Kullanıcı adı ve şifre doğruysa
            if (username.equals("admin") && password.equals("12345")) {
                System.out.println("Merhaba Bankamıza Hoşgeldiniz:");

                // Kullanıcı doğru giriş yaptıktan sonra işlemleri seçmesi için bir döngü oluşturuyoruz
                do {
                    // Kullanıcının yapabileceği işlemleri listeliyoruz
                    System.out.println("1 - Para Yatırma  "); 
                    System.out.println("2 - Para Çekme  "); 
                    System.out.println("3 - Bakiye sorgulama  "); 
                    System.out.println("4 - Çıkış yapma  ");
                    
                    System.out.println("***********************");
                    System.out.println("Lutfen Yapmak istediğiniz işlemi seçiniz:");

                    // Kullanıcının seçtiği işlemi alıyoruz
                    select = scanner.nextInt();

                    // Seçilen işleme göre yapılacak işlemleri belirliyoruz
                    switch (select) {
                        case 1 :
                            System.out.println("Lutfen yatırmak istediğiniz miktarı giriniz:");
                            int miktar = scanner.nextInt();
                            balance = miktar + balance;
                            System.out.println("Toplam bakiyeniz : " + balance);
                            break;

                        case 2 :
                            System.out.println("Çekmek istediğiniz miktarı giriniz :");
                            int cekilecek = scanner.nextInt();
                            balance = balance - cekilecek;
                            System.out.println("Son bakiye = " + balance);
                            break;

                        case 3 :
                            System.out.println("Bakiyeniz = " + balance);
                            break;
                    }
                } while (select != 4); // Kullanıcı çıkış yapmayı seçene kadar döngü devam eder

            } else {
                // Kullanıcı adı veya şifre hatalıysa
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre Girdiniz :");
                if (right == 0) {
                    System.out.println("Kartınız bloke oldu");
                } else {
                    System.out.println("Kalan deneme Hakkınız : " + right);
                }
            }
        }
    }
}
