import java.util.*;
 class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + "\t");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
