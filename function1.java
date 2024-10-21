import java.util.*;

/**
 * function1
 */
public class function1 {

    public static int sumOfNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOfNumbers(a, b);
        System.out.println(sum);
    }
}