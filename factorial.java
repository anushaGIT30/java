import java.util.*;

/**
 * factorial
 */
public class factorial {

    public static int findingFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = findingFactorial(n);
        System.out.println(res);
    }
}
