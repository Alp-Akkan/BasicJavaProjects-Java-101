public class App {
    public static void main(String[] args) {
        // Sayıları içeren bir dizi tanımlandı
        int[] numbers = {5, 6, 7, 8, 9};
        // Dizideki sayıların toplamını tutmak için değişken tanımlandı
        int sum = 0;
        // Harmonik ortalamayı hesaplamak için değişken tanımlandı
        double harmonik = 0.0;

        // Dizideki sayıların toplamı hesaplandı
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Ortalama hesaplandı ve ekrana yazdırıldı
        System.out.println("Ortalama: " + sum / numbers.length);

        // Harmonik ortalama hesaplandı
        for (double j = 1; j <= numbers.length; j++) {
            harmonik += (1 / j);
        }
        // Harmonik ortalama ekrana yazdırıldı
        System.out.println("Harmonik Ortalama: " + harmonik);
    }
}
