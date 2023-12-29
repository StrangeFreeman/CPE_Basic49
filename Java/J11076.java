import java.util.*;

//GCD
//CPE 11076
//UVa 11417

public class J11076 {
    public static int gcd(int a, int b) {
        int min = a;
        int max = b;
        int tmp = 0;
        int ans = 0;
        if (min > max) {
            tmp = min;
            min = max;
            max = tmp;
        }
        while (true) {
            tmp = max % min;

            if (tmp == 0) {
                // if (min == 1) {
                // ans = 0;
                // break;
                // } else {
                // ans = min;
                // break;
                // }
                ans = min;
                break;
            } else {
                max = min;
                min = tmp;
            }
        }
        // System.out.printf("%d ", ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int g = 0;
        while (in.hasNextInt()) {
            n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                g = 0;
                for (int i = 1; i < n; i++) {
                    for (int j = i + 1; j <= n; j++) {
                        g += gcd(i, j);
                    }
                }
                System.out.printf("%d\n", g);
            }
        }
    }
}
