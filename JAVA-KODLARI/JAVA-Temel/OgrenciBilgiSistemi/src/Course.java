public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sNote;
    public Course( String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
        this.sNote = 0.0;
    }
    
    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix))
        {
            this.teacher=teacher;
        }
        else{
            System.out.println("Öğretmen ders uyuşmazlığı");
        }
    }



    void printTeacher() {
        if (this.teacher != null) {
            this.teacher.print();
        } else {
            System.out.println("Öğretmen atanmamış");
        }
    }

}
