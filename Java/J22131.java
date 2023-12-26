import java.util.*;

/**
 * J22131
 */
public class J22131 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String s = in.nextLine();
            String a = new String();
            String b = new String();
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '"') {
                    end = i;
                    a = s.substring(start, end);
                    start = end + 1;
                    b = s.substring(start, s.length());
                    System.out.printf("%s''", a);
                }
            }
            if (end != s.length()) {
                System.out.printf("%s\n", b);
            }

        }
    }
}
