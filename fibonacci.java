import java.util.*;

/**
 * factorial
 */
public class fibonacci {

    public static void findingFactorial(int n) {
        int t1 = 0;
        int t2 = 1;
        System.out.println(t1 + " " + t2);
        for (int i = 2; i <= n; i++) {
            int t3 = t1 + t2;
            System.out.println(t3 + " ");
            t1 = t2;
            t2 = t3;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        findingFactorial(n);
    }
}
