
class Student {
    String name;
    int no;
    String address;
    int age;

    public void studentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }

}

public class oopsExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "anu";
        student1.age = 21;
        student1.address = "hyd";
        student1.studentInfo();

    }
}
