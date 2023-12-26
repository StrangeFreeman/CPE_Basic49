import java.util.*;

public class J10400 {
    public static int solve(int a) {
        int n = a;
        int len = 1;
        while (n != 1) {
            if (n % 2 == 1) {
                n = 3 * n + 1;
                len++;
            }

            else {
                n = n / 2;
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, m = 0, max = 0, tmp = 0;
        while (in.hasNextInt()) {
            n = in.nextInt();
            m = in.nextInt();
            if (n > m) {
                tmp = n;
                n = m;
                m = tmp;
            }
            max = 0;// max is SB
            tmp = 0;
            for (int i = n; i <= m; i++) {
                tmp = solve(i);
                if (max < tmp) {
                    max = tmp;
                }
            }
            System.out.printf("%d %d %d\n", n, m, max);
        }
    }
}
