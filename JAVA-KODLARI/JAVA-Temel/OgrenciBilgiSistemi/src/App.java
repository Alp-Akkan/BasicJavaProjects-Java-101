
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    Teacher t1 = new Teacher("TRH " , "MAHMUT " , "55554111221");
    Teacher t2 = new Teacher("FZK", "Kubilay    ", "8524566");
    Teacher t3 = new Teacher("BİO", "ASlı", "78569635");


    Course tarih = new Course("Tarih", "101", "TRH");
    tarih.addTeacher(t1);
    Course  fizik = new Course("FİZİK", "201", "FZK");
    fizik.addTeacher(t2);
    Course biyoloji = new Course("biyoloji", "303", "BIO");
    biyoloji.addTeacher(t3);

        Student s1 =new Student(tarih, fizik, biyoloji, "Hakan", "555555225", "4");
        s1.addBulkExamNote(65, 85, 89, 56   , 89, 76);
        Student s2 = new Student(tarih, fizik, biyoloji, "Şaban", "56985", "7");
        s2.addBulkExamNote(89, 78, 45, 65, 25, 100);


    }
}
