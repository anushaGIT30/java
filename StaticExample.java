//the function which we declared as static we can directly access 

class Person {
    String name;
    static String schoolName; // static variable
}

public class StaticExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "anu";

        // Correct way to access static variable
        Person.schoolName = "sri sai ram"; // Accessed using class name, not instance

        System.out.println(Person.schoolName); // Correct way to print static variable
    }
}
