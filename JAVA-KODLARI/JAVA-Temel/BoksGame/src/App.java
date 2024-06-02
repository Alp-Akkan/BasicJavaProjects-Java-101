import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // İki dövüşçü nesnesi oluşturulur: alp ve ali
        Fighter alp = new Fighter("alp", 10, 95, 90, 20, 50);
        Fighter ali = new Fighter("ali", 15, 95, 90, 15, 50);

        // Maç oluşturulur ve belirli ağırlık aralığı belirlenir: 80 ile 100 arası
        Match r = new Match(alp, ali, 80, 100);

        // Maç başlatılır
        r.run();
    }
}
