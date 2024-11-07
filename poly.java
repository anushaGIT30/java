import java.util.Scanner;

class Numbers {
    int a;
    int b;
    int c;

    public int printSum(int a, int b) {
        return a + b;
    }

    public int printSum(int a, int b, int c) {
        return a + b + c;
    }
    // function overloading :functon with the same name but differenet parameters
}

public class poly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        Numbers numbers = new Numbers();

        int sum1 = numbers.printSum(n, m);
        int sum2 = numbers.printSum(n, m, l);

        System.out.println(sum1);

        System.out.println(sum2);
    }
}
