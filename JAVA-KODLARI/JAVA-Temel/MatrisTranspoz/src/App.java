class App {

    // Matrisin transpozunu hesaplayan metod
    static void transpoz(int[][] arr) {
        // Transpoz matrisini oluşturur, satır ve sütun boyutları değişir
        int[][] trpz = new int[arr[0].length][arr.length];

        // Orijinal matrisi dolaşır ve transpoz matrisine elemanları aktarır
        for (int x = 0; x < arr.length; x++) { // Satırları dolaşır
            for (int y = 0; y < arr[0].length; y++) { // Sütunları dolaşır
                trpz[y][x] = arr[x][y]; // Elemanları yer değiştirerek yeni matrise aktarır
            }
        }

        // Transpoz matrisini ekrana yazdırır
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("Transpoz : ");

        // Transpoz matrisini ekrana yazdırmak için çift döngü kullanılır
        for (int[] ints : trpz) { // Satırları dolaşır
            for (int j = 0; j < trpz[0].length; j++) { // Sütunları dolaşır
                System.out.print(ints[j]); // Elemanı yazdırır
                System.out.print("\t"); // Elemanlar arasında tab boşluğu bırakır
            }
            System.out.println(); // Bir satırı tamamladıktan sonra alt satıra geçer
        }
    }

    public static void main(String[] args) {
        // Orijinal matrisi tanımlar
        int[][] list = {{1, 2, 3}, {4, 5, 6}};

        // Orijinal matrisi ekrana yazdırır
        System.out.println("--------------");
        System.out.println("Matris : ");
        for (int[] ints : list) { // Satırları dolaşır
            for (int j = 0; j < list[0].length; j++) { // Sütunları dolaşır
                System.out.print(ints[j]); // Elemanı yazdırır
                System.out.print("\t"); // Elemanlar arasında tab boşluğu bırakır
            }
            System.out.println(); // Bir satırı tamamladıktan sonra alt satıra geçer
        }

        // Transpoz metodunu çağırarak orijinal matrisin transpozunu hesaplar ve ekrana yazdırır
        transpoz(list);
        System.out.println("--------------");
    }
}
