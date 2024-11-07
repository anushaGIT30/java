class Person {
    String name;
    String address;
    int age;

    public void studentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }

    Person(String name1, String address1, int age1) {
        this.name = name1;
        this.address = address1;
        this.age = age1;
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Pass arguments in the correct order without specifying parameter names
        Person person = new Person("anu", "hyd", 21);

        // Call the studentInfo method on the person instance
        person.studentInfo();
    }
}
/*A constructor is used to initialize the state of an object.
A method is used to expose the behavior of an object.
A constructor must not have a return type.
A method must have a return type.
The constructor is invoked implicitly.
The method is invoked explicitly.
The Java compiler provides a default constructor if you don't have any constructor in a class.
The method is not provided by the compiler in any case.
The constructor name must be same as the class name.
The method name may or may not be same as the class name.
*/
