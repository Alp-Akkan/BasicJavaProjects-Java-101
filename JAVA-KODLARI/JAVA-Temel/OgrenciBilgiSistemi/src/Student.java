public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    public Student(Course course1, Course course2, Course course3, String name, String stuNo, String classes) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote( double note1 , double note2 , double note3 , double sNote1,double sNote2,double sNote3)
    {
        if (note1 >= 0 && note1 <= 100)
        this.course1.note = note1;

    if (note2 >= 0 && note2 <= 100)
        this.course2.note = note2;

    if (note3 >= 0 && note3 <= 100)
        this.course3.note = note3;

    if (sNote1 >= 0 && sNote1 <= 100)
        this.course1.sNote =sNote1;

    if (sNote2 >= 0 && sNote2 <= 100)
        this.course2.sNote = sNote2;

    if (sNote3 >= 0 && sNote3 <= 100)
        this.course3.sNote = sNote3;    }


        void isPass()
        {
            System.out.println(name);
            double course1 =(this.course1.sNote*0.20)+(this.course1.note*0.80);
            double course2 =(this.course2.sNote*0.20)+(this.course1.note*0.80);
            double course3 =(this.course3.sNote*0.20)+(this.course1.note*0.80);
            
            this.avarage = (course1+course2+course3)/3.0;
            printNote();

            if(this.avarage>55)
            {
                System.out.println("Sınfıı geçti");
                this.isPass = true;

            }
            else
            {
                System.out.println("Sınıfta kaldı");
                this.isPass = false;
            }
        }

        void printNote()
        {
        System.out.println(this.course1.name + " sınav notu: " + this.course1.note + " sözlü notu: " + this.course1.sNote);
        System.out.println(this.course2.name + " sınav notu: " + this.course2.note + " sözlü notu: " + this.course2.sNote);
        System.out.println(this.course3.name + " sınav notu: " + this.course3.note + " sözlü notu: " + this.course3.sNote);
        System.out.println("Ortalamanız: " + this.avarage);
        }



}
