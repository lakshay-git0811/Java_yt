import java.util.Scanner;

public class PracticeQues_01 {

    // 1. Enter 3 numbers from the user & make a function to print their average.

    // public static int calculateAvg(int a, int b, int c) {
    // int average = (a + b + c) / 3;
    // return average;
    // }
    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int average = calculateAvg(a, b, c);
    // System.out.println(average);
    // sc.close();
    // }

    // 2. Write a function to print the sum of all odd numbers from 1 to n.

    public static void printSum(int n) {
        if (n < 0) {
            System.out.println("Invalid input");
        } else {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    result = result + i;
                }
            }
            System.out.println(result);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
        sc.close();
    }

}
