public class Fighter {

    String name; // Dövüşçünün adı
    int damage; // Dövüşçünün vurduğu hasar miktarı
    int weight; // Dövüşçünün ağırlığı
    int health; // Dövüşçünün sağlık puanı
    int dodge; // Dövüşçünün kaçınma yeteneği yüzdesi
    int firstHit; // Dövüşçünün ilk vuruş şansı yüzdesi

    // Fighter sınıfının yapıcı metodu
    public Fighter(String name, int damage, int weight, int dodge, int firstHit, int health) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        // Dövüşçünün kaçınma yeteneği kontrol edilir ve 0 ile 100 arasında sınırlanır
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        // Dövüşçünün ilk vuruş şansı kontrol edilir ve 0 ile 100 arasında sınırlanır
        if (firstHit >= 0 && firstHit <= 100) {
            this.firstHit = firstHit;
        } else {
            this.firstHit = 0;
        }
    }

    // Rakibine saldıran ve hasar veren metod
    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");

        // Rakibin kaçınma yeteneği kontrol edilir
        if (foe.isDodge()) {
            System.out.println(foe.name + " Hasar Almadı");
            return foe.health;
        }
        // Rakibin sağlık puanı, saldıranın hasarıyla düşürülür
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    // Dövüşçünün rakibin saldırısından kaçınıp kaçınmadığını belirleyen metod
    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    // Dövüşçünün ilk vuruş yapma şansını belirleyen metod
    boolean isFirstHit() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.firstHit;
    }
}
