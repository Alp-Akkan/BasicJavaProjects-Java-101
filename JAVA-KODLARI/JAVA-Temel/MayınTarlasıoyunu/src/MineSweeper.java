import java.util.Scanner;

public class MineSweeper {
    // Oyunun satır ve sütun sayısını belirten değişkenler
    int rowNumber;
    int colNumber;
    int mineNumber; // Toplam mayın sayısı
    String[][] answerBoard; // Mayınların yer aldığı gerçek tablo
    String[][] board; // Oyuncunun gördüğü tablo
    int correctAnswer = 0; // Doğru tahmin edilen hücre sayısı
    int row; // Kullanıcının seçtiği satır
    int column; // Kullanıcının seçtiği sütun
    int rowMaxLimit; // Satır kontrolü için maksimum sınır
    int rowMinLimit; // Satır kontrolü için minimum sınır
    int columnMaxLimit; // Sütun kontrolü için maksimum sınır
    int columnMinLimit; // Sütun kontrolü için minimum sınır
    int mineCount = 0; // Çevredeki mayın sayısı

    // Yapıcı metot, oyun tahtasını ve mayınları başlatır
    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineNumber = rowNumber * colNumber / 4; // Toplam hücre sayısının dörtte biri kadar mayın yerleştirilecek
        this.board = new String[rowNumber][colNumber];
        this.answerBoard = new String[rowNumber][colNumber];
    }

    // Tüm hücreleri başlangıçta "-" ile doldurur
    void fillArr() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.answerBoard[i][j] = "-";
                this.board[i][j] = "-";
            }
        }
    }

    // Rastgele hücrelere mayın yerleştirir
    void placeMines() {
        for (int i = 0; i < this.mineNumber; i++) {
            int row = (int) (Math.random() * this.rowNumber);
            int column = (int) (Math.random() * this.colNumber);
            if (this.answerBoard[row][column].equals("*")) {
                i--; // Eğer hücrede zaten mayın varsa, tekrar dene
            } else {
                this.answerBoard[row][column] = "*"; // Hücreye mayın yerleştir
            }
        }
    }

    // Oyuncunun gördüğü tabloyu gösterir
    void showBoard() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Gerçek mayın tablosunu gösterir (debugging veya oyun sonunda kullanılabilir)
    void showAnswerBoard() {
        System.out.println("Mayınların konumu");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.answerBoard[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Seçilen hücrenin çevresindeki mayınları sayar ve tabloya yazar
    void findMines() {
        this.rowMaxLimit = this.row + 1;
        this.rowMinLimit = this.row - 1;
        this.columnMaxLimit = this.column + 1;
        this.columnMinLimit = this.column - 1;

        // Sınır kontrolü yapar
        if (this.rowMaxLimit > this.rowNumber - 1) {
            this.rowMaxLimit--;
        }
        if (this.rowMinLimit < 0) {
            this.rowMinLimit++;
        }
        if (this.columnMinLimit < 0) {
            this.columnMinLimit++;
        }
        if (this.columnMaxLimit > this.colNumber - 1) {
            this.columnMaxLimit--;
        }

        // Çevredeki mayınları sayar
        for (int i = this.rowMinLimit; i <= this.rowMaxLimit; i++) {
            for (int j = this.columnMinLimit; j <= this.columnMaxLimit; j++) {
                if (this.answerBoard[i][j].equals("*")) {
                    this.mineCount++;
                }
            }
        }

        // Bulunan mayın sayısını oyuncunun tablosuna yazar
        this.board[this.row][this.column] = Integer.toString(this.mineCount);
        this.mineCount = 0;
    }

    // Oyunu çalıştıran ana metot
    void run() {
        Scanner scanner = new Scanner(System.in);
        this.fillArr(); // Tabloyu doldur
        this.placeMines(); // Mayınları yerleştir
        this.showAnswerBoard(); // Mayınların yerini göster (opsiyonel, debugging için)

        // Oyuncu tüm mayınsız hücreleri bulana kadar devam eder
        while (this.correctAnswer < this.rowNumber * this.colNumber - this.mineNumber) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            this.showBoard(); // Oyuncunun gördüğü tabloyu göster
            System.out.println("Lütfen satır sayısı giriniz:");
            this.row = scanner.nextInt() - 1; // Kullanıcının girdiği satırı al
            System.out.println("Lütfen sütun sayısı giriniz:");
            this.column = scanner.nextInt() - 1; // Kullanıcının girdiği sütunu al

            // Girilen değerin geçerli olup olmadığını kontrol et
            if (this.row >= 0 && this.row < this.rowNumber) {
                if (this.column >= 0 && this.column < this.colNumber) {
                    if (this.answerBoard[this.row][this.column].equals("*")) {
                        this.showAnswerBoard(); // Mayınları göster
                        System.out.println("Kaybettiniz: Mayın patladı");
                        return;
                    } else {
                        this.findMines(); // Çevredeki mayınları bul
                        this.correctAnswer++; // Doğru tahmin sayısını arttır
                        if (this.correctAnswer == this.rowNumber * this.colNumber - this.mineNumber) {
                            System.out.println("Son tablo");
                            this.showBoard(); // Oyunun sonundaki tabloyu göster
                            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
                            System.out.println("Tebrikler kazandınız");
                            return;
                        }
                    }
                } else {
                    System.out.println("Geçerli aralık giriniz:");
                }
            } else {
                System.out.println("Geçerli aralık giriniz:");
            }
        }
    }
}
