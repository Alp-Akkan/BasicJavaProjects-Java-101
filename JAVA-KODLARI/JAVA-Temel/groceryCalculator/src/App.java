import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // Program başlığı yazdırılır
    System.out.println("Grocery Calculator");

    // Kullanıcıdan veri girişi için Scanner nesnesi oluşturulur
    Scanner scanner = new Scanner(System.in);

    // Armut, elma, domates, muz ve patlıcan için değişkenler tanımlanır
    double pear;
    double apple;
    double tomato;
    double banana;
    double eggplant;

    // Toplam fiyat için değişken tanımlanır
    double total;

    // Kullanıcıdan armut miktarı istenir ve değişkene atanır
    System.out.println("Lutfen armut miktarını giriniz:");
    pear = scanner.nextDouble();

    // Kullanıcıdan elma miktarı istenir ve değişkene atanır
    System.out.println("Lutfen elma miktarını giriniz:");
    apple = scanner.nextDouble();

    // Kullanıcıdan domates miktarı istenir ve değişkene atanır
    System.out.println("Lutfen domates miktarını giriniz:");
    tomato = scanner.nextDouble();

    // Kullanıcıdan muz miktarı istenir ve değişkene atanır
    System.out.println("Lutfen muz miktarını giriniz:");
    banana = scanner.nextDouble();

    // Kullanıcıdan patlıcan miktarı istenir ve değişkene atanır
    System.out.println("Lutfen patlıcan miktarını giriniz : ");
    eggplant = scanner.nextDouble();

    // Her bir gıdanın fiyatını ve miktarını çarparak toplam fiyata eklenir
    total = pear * 2.14 + apple * 3.67 + tomato * 1.11 + banana * 0.95 + eggplant * 5.00;

    // Toplam fiyat yazdırılır
    System.out.println("Toplam ödemeniz gereken miktar : " + total);
  }
}
