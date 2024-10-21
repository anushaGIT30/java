import java.util.Scanner;

public class Pattern {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows (n): ");
        int n = sc.nextInt(); // number of rows

        System.out.println("Enter number of columns (m): ");
        int m = sc.nextInt(); // number of columns

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= m; j++) {
                // Print '*' for first row, last row, first column, or last column
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space inside the rectangle
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
