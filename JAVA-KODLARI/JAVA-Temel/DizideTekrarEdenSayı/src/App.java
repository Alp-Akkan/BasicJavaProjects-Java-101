public class App {
    // Belirtilen değerin dizide bulunup bulunmadığını kontrol eden yardımcı metot
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true; // Değer bulunursa true döndür
            }
        }
        return false; // Değer bulunamazsa false döndür
    }

    public static void main(String[] args) throws Exception {
        // Ana dizi ve tekrarlayan değerleri saklayacak dizi tanımlanıyor
        int[] list = {3, 6, 5, 9, 9, 3, 6, 5, 5, 15, 25, 36, 36};
        int[] duplicate = new int[list.length];
        int strindex = 0; // Tekrarlayan değerlerin indeksini tutmak için

        // Ana dizideki elemanları karşılaştırarak tekrarlayanları bulma
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                // Farklı indekslerdeki aynı değerleri kontrol etme
                if ((i != j) && (list[i] == list[j])) {
                    // Tekrarlayan değeri daha önce duplicate dizisinde kontrol etme
                    if (!isFind(duplicate, list[i])) {
                        duplicate[strindex++] = list[i]; // Tekrarlayan değeri duplicate dizisine ekleme
                    }
                    break; // Aynı değeri tekrar kontrol etmemek için döngüden çık
                }
            }
        }

        // duplicate dizisindeki tekrarlayan değerleri ekrana yazdırma
        for (int value : duplicate) {
            if (value != 0) { // Değer sıfır değilse (başlangıç değeri olan sıfırları atlamak için)
                System.out.println(value); // Tekrarlayan değeri yazdır
            }
        }
    }
}
