import java.util.*;

//Mutant Flatworld Explorers
//CPE 23641
//UVa 118

public class J23641 {
    public static int pos(char p) {
        int p2f = 0;
        if (p == 'N') {
            p2f = 0;
        } else if (p == 'E') {
            p2f = 1;
        } else if (p == 'S') {
            p2f = 2;
        } else if (p == 'W') {
            p2f = 3;
        }

        return p2f;
    }

    public static char f2p(int flag) {
        char ans = '0';
        if (flag == 0) {
            ans = 'N';
        } else if (flag == 1) {
            ans = 'E';
        } else if (flag == 2) {
            ans = 'S';
        } else if (flag == 3) {
            ans = 'W';
        }
        return ans;
    }

    public static int rf(char p) {
        if (p == 'R') {
            return 1;
        } else if (p == 'L') {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int upperx = in.nextInt();
        int uppery = in.nextInt();
        int[][] falls = new int[uppery + 1][upperx + 1];
        for (int i = 0; i < uppery + 1; i++) {
            for (int j = 0; j < upperx + 1; j++) {
                falls[i][j] = 0;
            }
        }

        int f = 0;
        int tmp = 0;

        while (in.hasNextInt()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int tx = x;
            int ty = y;
            char lp = ' ';
            char fp = in.next().charAt(0);
            f = pos(fp);
            String poss = in.next();
            // in.close();
            int islost = 0;

            for (int i = 0; i < poss.length(); i++) {
                tmp = f;
                tx = x;
                ty = y;
                f += rf(poss.charAt(i));
                if (f > 3) {
                    f = 0;
                } else if (f < 0) {
                    f = 3;
                }

                if (tmp - f == 0) {
                    if (f == 0) {
                        y++;
                    } else if (f == 1) {
                        x++;
                    } else if (f == 2) {
                        y--;
                    } else {
                        x--;
                    }
                }
                if (falls[ty][tx] == 1) {
                    if (x == upperx + 1 || x < 0 || y == uppery + 1 || y < 0) {
                        x = tx;
                        y = ty;
                    }
                }

                lp = f2p(f);

                // System.out.printf("%d %d %c\n", x, y, lp);

                if (x == upperx + 1 || x < 0) {
                    islost = 1;
                    falls[ty][tx] = 1;
                    break;
                } else if (y == uppery + 1 || y < 0) {
                    islost = 1;
                    falls[ty][tx] = 1;
                    break;
                }
            }
            if (islost == 1) {
                System.out.printf("%d %d %c LOST\n", tx, ty, lp);
            } else {
                System.out.printf("%d %d %c\n", x, y, lp);
            }

        }

    }

}
