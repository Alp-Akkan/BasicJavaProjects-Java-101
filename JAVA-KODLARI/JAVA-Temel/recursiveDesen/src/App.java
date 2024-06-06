import java.util.Scanner;

public class App {
   
    // Deseni oluşturan recursive metot
    static int design(int n, boolean control, int flag) {
        if (control) { // Kontrol true ise
            if (n > 0) { // n pozitif ise
                System.out.print(n + " "); // n'i ekrana yazdır
                flag++; // flag artır
                return design(n - 5, true, flag); // bir sonraki adıma geçmek için metodu tekrar çağır
            } else { // n 0 veya negatif ise
                return design(n, false, flag); // Kontrolü false yaparak metodu tekrar çağır
            }
        } else { // Kontrol false ise
            System.out.print(n + " "); // n'i ekrana yazdır
            if (flag > 0) { // flag pozitif ise
                flag--; // flag azalt
                return design(n + 5, false, flag); // bir sonraki adıma geçmek için metodu tekrar çağır
            } else { // flag 0 ise
                return 0; // Metodu sonlandır
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt(); // Kullanıcıdan bir sayı al
        System.out.println(design(n, true, 0)); // Deseni oluşturan metodu çağır ve sonucu yazdır
    }

}
