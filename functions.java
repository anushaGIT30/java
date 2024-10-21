import java.util.*;

public class functions {

    public static void printMyname(String s) {
        System.out.println(s);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printMyname(s);
    }
}