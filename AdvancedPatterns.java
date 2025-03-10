public class AdvancedPatterns {
    public static void main(String[] args) {
        // butterfly pattern
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // // first part stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // // middle spaces
        // for (int j = 2 * (n - i); j > 0; j--) {
        // System.out.print(" ");
        // }
        // // second part stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // // first part stars
        // for (int j = i; j >= 1; j--) {
        // System.out.print("* ");
        // }
        // // middle spaces
        // for (int j = 0; j < 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // // second part stars
        // for (int j = i; j >= 1; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Solid Rhombus

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // stars
        // for (int j = 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // number pyramid

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // numbers
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // palindrome pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // first part numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // // second part numbers
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Diamond pattern
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // second part
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            // second part
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
