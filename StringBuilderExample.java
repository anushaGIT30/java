import java.util.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        StringBuilder sb = new StringBuilder(); // Create an empty StringBuilder object

        // Prompt the user to enter some text
        System.out.println("Enter some text: ");
        String input = sc.nextLine(); // Read the user's input as a string

        sb.append(input); // Append the user's input to the StringBuilder

        // Display the contents of the StringBuilder
        // charAt index
        System.out.println(sb.charAt(2));
        sb.setCharAt(2, 'k');
        // sb.insert(4, k);

        // Common Methods: It provides methods like append(), insert(), delete(),
        // reverse(), and more,
        // which help in efficient string manipulations
        // delete
        // sb.delete(1, 3);
        // sb.append("ak");
        sb.reverse();
        System.out.println("StringBuilder contains: " + sb);
    }
}
