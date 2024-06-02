public class Match {

    Fighter f1; // İlk dövüşçüyü temsil eden nesne
    Fighter f2; // İkinci dövüşçüyü temsil eden nesne
    int minWeight; // Maçın minimum ağırlığı
    int maxWeight; // Maçın maksimum ağırlığı

    // Match sınıfının yapıcı metodu
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Maçı başlatan metod
    public void run() {
        // Dövüşçülerin ağırlığının uygunluğunu kontrol eder
        if (isCheck()) {
            // Dövüş devam ederken
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("YENI ROUND"); // Yeni bir raunt başlatır
                // İlk dövüşçünün sıra atışını kontrol eder
                if (this.f1.isFirstHit()) {
                    this.f2.health = this.f1.hit(f2); // İlk dövüşçü, ikinci dövüşçüyü vurur
                    // Kazanan kontrol edilir
                    if (isWin()) {
                        break; // Eğer biri kazandıysa döngüyü sonlandırır
                    }
                }
                // İkinci dövüşçünün sıra atışını kontrol eder
                if (this.f2.isFirstHit()) {
                    this.f1.health = this.f2.hit(f1); // İkinci dövüşçü, ilk dövüşçüyü vurur
                    // Kazanan kontrol edilir
                    if (isWin()) {
                        break; // Eğer biri kazandıysa döngüyü sonlandırır
                    }
                }
                // Her raunt sonunda dövüşçülerin sağlık durumunu yazdırır
                System.out.println(this.f1.name + "SAGLIK" + this.f1.health);
                System.out.println(this.f2.name + "SAGLIK" + this.f2.health);
            }
        } else {
            System.out.println("Uyuşmazlık Var"); // Eğer dövüşçülerin ağırlığı uygun değilse uyarı mesajı verir
        }
    }

    // Dövüşçülerin ağırlığının uygunluğunu kontrol eden metod
    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    // Kazananın belirlenip yazdırıldığı metod
    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı ");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " KAZANDI");
            return true;
        }
        return false;
    }
}
