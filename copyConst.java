
class Employee {
    String name;
    int roll;
    String depart;

    public void EmployeeDetails() {
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.depart);
    }

    Employee(String name, int roll, String depart) {
        this.name = name;
        this.roll = roll;
        this.depart = depart;
    }

    // copy constructor
    Employee(Employee e) {
        this.name = e.name;
        this.roll = e.roll;
        this.depart = e.depart;
    }

    Employee() {
        // this.name = "Unknown";
        // this.roll = 20;
        // this.depart = "Unknown";
    }

}

public class copyConst {
    public static void main(String[] args) {

        // Employee employee1 = new Employee(); // Uses the no-argument constructor
        // Employee employee = new Employee("John", 101, "HR");
        Employee e1 = new Employee();
        e1.name = "anu";
        e1.roll = 1;
        e1.depart = "software developer";
        Employee e2 = new Employee(e1);
        e2.EmployeeDetails();
        // e1.EmployeeDetails();
    }
}
