import java.util.*;

class Firstclass {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        SC.nextLine();
        String name = SC.nextLine();

        for (int i = 0; i <= n; i++) {
            System.out.println(name);
        }

        // nextLine is used for string
        // nextInt is used for integer values
        // nextFloat is used for float values
        // nextDouble is used for double values
        // sc.close();

    }
}