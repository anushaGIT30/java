import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder("anusha");
        for (int i = 0; i < s.length() / 2; i++) {
            int start = i;
            int end = s.length() - 1 - i;

            char front_char = s.charAt(start);
            char back_char = s.charAt(end);
            s.setCharAt(start, back_char);
            s.setCharAt(end, front_char);
        }
        System.out.println(s);
    }
}
