import java.util.Scanner;

public class LoopsQue {
    public static void main(String[] args) {
        // Print the sum of first n natural numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);
        // sc.close();

        // Print the table of a natural number input by user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }

        sc.close();

    }
}
