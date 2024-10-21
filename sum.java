import java.util.*;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += i;
        }
        System.out.println(Sum);

    }
}
