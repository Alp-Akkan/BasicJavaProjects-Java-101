public class App {
    public static void main(String[] args) throws Exception {

        // 6 satır ve 4 sütundan oluşan bir String dizisi tanımlandı
        String[][] array = new String[6][4];

        // Diziye A harfi şeklinde yıldızları yerleştirmek için iki katmanlı döngü kullanıldı
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // A harfinin yıldızlarla oluşturulacak kısımları belirlendi
                if ((i == 0 && j != 1 && j != 2) || // ilk satırın kenarları
                    (i == 1 && (j == 0 || j == 3)) || // ikinci satırın kenarları
                    (i == 2 && (j == 0 || j == 3)) || // üçüncü satırın kenarları
                    (i == 3 && (j != 0 && j != 3)) || // dördüncü satırın iç kısmı
                    (i == 4 && (j == 1 || j == 2)) || // beşinci satırın iç kısmı
                    i == 5) { // alt kenar
                    array[i][j] = " * ";
                } else {
                    // A harfi dışındaki kısımlar boşluk ile dolduruldu
                    array[i][j] = "   ";
                }
            }
        }

        // Oluşturulan A harfi şekli ekrana yazdırıldı
        for (String[] row : array) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
