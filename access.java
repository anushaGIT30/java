class apps {
    public String name;
    public String email;
    private int password;

    // to access the private member of the class we use getter and setter method
    public int getPassword() {
        return this.password;
    }

    public void setPassword(int pass) {
        this.password = pass;
    }
}

public class access {
    public static void main(String[] args) {
        apps account1 = new apps();
        account1.setPassword(1234);
        System.out.println(account1.getPassword());

    }
}
// in java there are 4 types of access modifiers
// public,private,protected,default