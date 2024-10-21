import java.util.*;

/**
 * arrays
 */
public class search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();
        System.out.println("enter x value:");
        int x = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("index at " + i);

            }
        }

    }
}
