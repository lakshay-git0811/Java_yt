import java.util.Scanner;

public class PracticeQues_01 {

    public static int calculateAvg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {
        // 1. Enter 3 numbers from the user & make a function to print their average.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = calculateAvg(a, b, c);
        System.out.println(average);
    }
}
