import java.util.*;

//Rotating Sentences
//CPE 21914
//UVa 490

public class J21914 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        while (in.hasNextLine()) {
            s += in.nextLine() + "\n";
        }
        // System.out.println();
        // for (int i = 0; i < s.length(); i++) {
        // System.out.printf("%c", s.charAt(i));
        // }

        int l = 0;
        int tmp = 0;
        int[] slen = new int[101];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\n') {
                slen[l] = i - tmp;
                l++;
                tmp = i - 1;
            }
        }
        System.out.printf("\n%d\n", l);
        for (int i = 0; i < l; i++)
            System.out.printf("%d ", slen[i]);

        int max = 0;
        for (int i = 0; i < l; i++) {
            if (max < slen[i]) {
                max = slen[i];
            }
        }

        int[][] arr = new int[max][l];
        for (int i = l; i > 0; i--) {
            for (int j = 0; j < slen[l]; j++) {
                if (s.charAt(s.length() - slen[j]) = '\n') {
                    break;
                } else {
                    arr[i][j] = s.charAt(i);
                }
            }
        }
    }
}
