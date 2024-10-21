import java.util.*;

/**
 * strings
 * 1.string concatenation means "+"(adding of 2 strings)
 * 2. string.length()
 * 3. charAt- gives the individual characters
 * 4. string.compareTo it compares the 2 strings
 * ---> it has 3 cases
 * if s1==s2 returns 0
 * if s1>s2 returns +ve value
 * if s1<s2 returns -ve value
 * syntax: string1.compareTo(string2)
 * we can also declare if(new String("abcd")==new String("abcd"))it will give
 * not equal
 * 5.substring = s.substring(begin,end)
 * 
 */
public class strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
