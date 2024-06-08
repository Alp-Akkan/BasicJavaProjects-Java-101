import java.util.Scanner; // Kullanıcıdan giriş almak için Scanner sınıfı içe aktarılır.

public class App {

    // İlk palindrome kontrolü yöntemi
    static boolean isPalindrom(String str) {
        int i = 0; // String'in başından başlayacak indeks
        int j = str.length() - 1; // String'in sonundan başlayacak indeks
        while (i < j) { // İki indeks birbirini geçene kadar devam eder
            if (str.charAt(i) != str.charAt(j)) { // Eğer herhangi bir karakter çifti eşleşmiyorsa
                return false; // String palindrome değildir
            }
            i++; // Başlangıç indeksi bir artır
            j--; // Bitiş indeksini bir azalt
        }
        return true; // Tüm karakter çiftleri eşleşiyorsa, string palindromdur
    }

    // İkinci palindrome kontrolü yöntemi
    static boolean isPalindrom2(String str) {
        String reverse = ""; // Ters çevrilmiş stringi tutmak için boş bir string
        for (int i = str.length() - 1; i >= 0; i--) { // String'in sonundan başlayarak ilk karakterine kadar döner
            reverse += str.charAt(i); // Karakterleri ters sırayla reverse stringine ekler
        }

        if (str.equals(reverse)) { // Orijinal string ile ters stringi karşılaştırır
            return true; // Eğer eşitse, string palindromdur
        } else {
            return false; // Eğer eşit değilse, string palindrome değildir
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturulur
        System.out.println("Lutfen bir kelime giriniz:"); // Kullanıcıya bir kelime girmesi istenir

        String str = scanner.nextLine(); // Kullanıcının girdiği kelime alınır ve 'str' değişkenine atanır

        // İlk yöntemle palindrome kontrolü
        if (isPalindrom(str)) { // Eğer kelime palindrom ise
            System.out.println("Girdiğiniz Kelime palindromdur."); // Palindrom olduğunu bildirir
        } else { // Eğer kelime palindrom değilse
            System.out.println("Girdiğiniz kelime palindrom değildir."); // Palindrom olmadığını bildirir
        }

        // İkinci yöntemle palindrome kontrolü
        if (isPalindrom2(str)) { // Eğer kelime palindrom ise
            System.out.println("Girdiğiniz kelime palindromdur."); // Palindrom olduğunu bildirir
        } else { // Eğer kelime palindrom değilse
            System.out.println("Girdiğiniz kelime palindrom değildir."); // Palindrom olmadığını bildirir
        }

        scanner.close(); // Scanner nesnesi kapatılır
    }
}
