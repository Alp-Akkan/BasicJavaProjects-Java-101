public class Employee {
    // Çalışanın adını tutan değişken
    String name;
    // Çalışanın maaşını tutan değişken
    int salary;
    // Çalışanın haftalık çalışma saatini tutan değişken
    int workHours;
    // Çalışanın işe başlangıç yılını tutan değişken
    int hireYear;

    // Yapıcı metot: Bu metot, Employee nesnesi oluşturulurken çağrılır ve nesnenin özelliklerini ayarlar
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu: Maaş 1000'den büyükse, maaşın %3'ü kadar vergi hesaplar
    public int tax() {
        if (salary > 1000) {
            return salary * 3 / 100;
        }
        return 0; // Maaş 1000 veya daha düşükse vergi sıfırdır
    }

    // Bonus hesaplama metodu: Haftalık çalışma saati 40'tan fazlaysa, her ekstra saat için 30 birim bonus hesaplar
    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0; // Haftalık çalışma saati 40 veya daha azsa bonus sıfırdır
    }

    // Maaş artışı hesaplama metodu: Çalışma yılına göre maaş artışını hesaplar
    public int raiseSalary() {
        int currentYear = 2021; // Mevcut yıl
        int yearsWorked = currentYear - hireYear; // Çalışanın kaç yıldır çalıştığını hesaplar
        
        if (yearsWorked < 10) {
            return salary * 5 / 100; // 10 yıldan az çalışanlara %5 zam
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 10 / 100; // 10-19 yıl çalışanlara %10 zam
        } else if (yearsWorked >= 20) {
            return salary * 15 / 100; // 20 yıl ve üzeri çalışanlara %15 zam
        } else {
            return 0; // Çalışma yılı sıfır veya negatif ise zam yapılmaz (teorik olarak mümkün değil)
        }
    }

    // Nesneyi yazdırma metodu: Çalışanın bilgilerini ekrana yazdırır
    @Override
    public String toString() {
        int tax = tax(); // Vergiyi hesaplar
        int bonus = bonus(); // Bonusu hesaplar
        int raise = raiseSalary(); // Maaş artışını hesaplar
        
        // Çalışanın bilgilerini ekrana yazdırır
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma saati: " + workHours);
        System.out.println("Başlangıç yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (salary + bonus - tax));
        System.out.println("Toplam Maaş: " + (salary + bonus - tax + raise));
        
        return ""; // toString metodunun dönüş değeri olarak boş bir string döndürür
    }
}

// Bu sınıf, bir çalışanın adını, maaşını, çalışma saatlerini ve işe başlama yılını tutar ve bu bilgilere dayalı vergi, bonus ve maaş artışlarını hesaplar.
// Ayrıca, çalışanın bilgilerini ekrana yazdıran bir metot içerir.
