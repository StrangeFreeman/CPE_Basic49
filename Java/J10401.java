import java.util.*;

//fibonaccimal base
//CPE 10401 
//UVa 948

public class J10401 {
    public static void test(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("\n");
    }

    public static int[] fib_C(int a) {
        int c = 2;// c+1
        int[] arr = new int[a];
        arr[0] = 1;
        arr[1] = 2;
        while (true) {

            if ((arr[c - 1] + arr[c - 2]) >= a) {
                break;
            } else {
                arr[c] = arr[c - 1] + arr[c - 2];
                c++;
            }

        }

        int[] ans = bsWithNOZero(arr, c);

        return ans;
    }

    public static int[] bsWithNOZero(int[] arr, int n) {

        int tmp = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tmp = n;
        int[] fib = fib_C(n);
        int cfib = fib.length;
        // test(fib, cfib);
        int[] ans = new int[cfib];
        int i = 0;
        while (tmp > 0) {
            if (tmp - fib[i] < 0) {
                ans[i] = 0;
                i++;
            } else {
                tmp -= fib[i];
                ans[i] = 1;
                i += 2;
            }
            System.out.printf("%d %d", ans[i], i);

        }
        System.out.printf("\n");
        test(ans, cfib);

    }
}
