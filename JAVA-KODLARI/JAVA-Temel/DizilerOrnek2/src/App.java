import java.util.Arrays; // Arrays sınıfını kullanabilmek için import edildi

public class App {
    // Bir dizideki elemanların frekansını kontrol eden metod
    public static boolean isFrequence(int[] arr, int n) {
        boolean[] number = new boolean[n]; // Elemanların kontrol edilip edilmediğini tutan bir boolean dizi

        Arrays.fill(number, false); // Tüm elemanları başlangıçta false olarak ayarla

        for (int i = 0; i < n; i++) {
            if (number[i] == true) {
                continue; // Eğer eleman daha önce kontrol edildiyse, döngünün geri kalanını atla
            }
            int count = 1; // Elemanın kaç kere tekrarlandığını saymak için değişken
            for (int j = i + 1; j < n; j++) { // i'nin ilerleyen elemanları için kontrol
                if (arr[i] == arr[j]) { // Eğer iki eleman eşitse
                    number[j] = true; // Elemanın kontrol edildiğini işaretle
                    count++; // Sayacı artır
                }
            }
            if (count > 1) { // Eğer eleman en az 1 kere tekrarlandıysa
                System.out.println(arr[i] + " sayısı " + count + " defa tekrar edildi.");
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int[] list = {50, 10, 10, 30, 10, 50, 60, 20, 20, 10, 30, 60, 90, 30, 10}; // Kontrol edilecek dizi

        int n = list.length; // Dizinin uzunluğunu al
        System.out.println("Liste: " + Arrays.toString(list)); // Diziyi ekrana yazdır
        System.out.println("***************************");

        System.out.println("Tekrar eden sayılar:");
        isFrequence(list, n); // Dizideki tekrar eden elemanları kontrol eden metodu çağır
    }
}
