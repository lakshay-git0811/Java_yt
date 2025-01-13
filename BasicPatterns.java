public class BasicPatterns {
    public static void main(String[] args) {

        // solid rectangle

        // int r = 4;
        // int c = 5;
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // System.out.print(("*"));
        // }
        // System.out.println();
        // }

        // hollow rectangle

        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
