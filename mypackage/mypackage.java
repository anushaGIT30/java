// File: src/mypackage/Bank.java
package mypackage;

public class Bank { // Renamed from 'mypackage' to 'Bank'
    private String name;
    private int accountNumber;

    public Bank(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

// File: src/mypackage/MyPackages.java
public class mypackage {
    public static void main(String[] args) {
        Bank bankAccount = new Bank("ABC Bank", 123456); // Correctly reference the 'Bank' class
        bankAccount.displayDetails();
    }
}