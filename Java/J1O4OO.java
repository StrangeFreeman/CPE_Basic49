import java.util.*;

public class J1O4OO {
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
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;// max is SB
        int tmp = 0;
        for (int i = n; i <= m; i++) {
            tmp = solve(i);
            if (max < tmp) {
                max = tmp;
            }
        }
        System.out.printf("%d %d %d", n, m, max);
    }
}
