public class App {
    public static void main(String[] args) throws Exception {
        // Asal sayı kontrolü için kullanılacak sayaç değişkenlerini tanımlıyoruz
        int counter1 = 0;
        int counter2 = 0;

        // 2'den başlayarak 100'e kadar olan sayıları kontrol etmek için dış döngüyü oluşturuyoruz
        for (int i = 2; i <= 100; i++) {
            // Her yeni sayı için counter1'i sıfırlıyoruz
            counter1 = 0;

            // 2'den başlayarak i'ye kadar olan sayılarla bölme kontrolü yapıyoruz
            for (int j = 2; j < i; j++) {
                // Eğer i, j'ye tam bölünüyorsa asal değildir
                if (i % j == 0) {
                    // Asal olmayan sayı için counter1'i artırıyoruz ve iç döngüden çıkıyoruz
                    counter1++;
                    break;
                }
            }

            // Eğer counter1 hala 0 ise, i sayısı asal bir sayıdır
            if (counter1 == 0) {
                // Asal sayıyı ekrana yazdırıyoruz
                System.out.println(i);

                // Toplam asal sayı sayısını tutan counter2'yi artırıyoruz
                counter2++;
            }
        }

        // 1 ile 100 arasında toplam asal sayı adedini ekrana yazdırıyoruz
        System.out.println("1 ile 100 arasında ki toplam asal sayı = " + counter2);
    }
}
