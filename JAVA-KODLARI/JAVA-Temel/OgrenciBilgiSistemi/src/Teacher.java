public class Teacher {
    String name;
    String phone;
    String branch;

    public Teacher(String branch, String name, String phone) {
        this.branch = branch;
        this.name = name;
        this.phone = phone;
    }
    

     public void print()
    {
        System.out.println("Adı : " +this.name);
        System.out.println("Telefon : " +this.phone);
        System.out.println("Bransı:" + this.branch);
    }

}
