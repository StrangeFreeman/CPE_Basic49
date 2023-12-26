import java.util.*;

/**
 * J22811
 */
public class J22811 {
    public static int bouble_sort(int[] arr, int n) {
        int[] a = arr;
        int tmp = 0;
        int c = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tcase = 0;
        for (int i = 0; i < n; i++) {
            tcase = in.nextInt();
            int[] arr = new int[tcase];
            for (int j = 0; j < tcase; j++) {
                arr[j] = in.nextInt();
            }
            int ans = bouble_sort(arr, tcase);
            System.out.printf("Optimal train swapping takes %d swaps.\n", ans);

        }
    }
}
