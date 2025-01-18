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

    // public static void printSum(int n) {
    // if (n < 0) {
    // System.out.println("Invalid input");
    // } else {
    // int result = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // result = result + i;
    // }
    // }
    // System.out.println(result);
    // }

    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // printSum(n);
    // sc.close();
    // }

    // 3. Write a function which takes in 2 numbers and returns the greater of those
    // two.

    // public static void returnGreater(int a, int b) {
    // if (a > b) {
    // System.out.println("Greater: " + a);
    // } else if (b > a) {
    // System.out.println("Greater: " + b);
    // } else {
    // System.out.println("Both are equal");
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // returnGreater(a, b);
    // sc.close();
    // }

    // 4. Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    // public static void returnCircumference(int rad) {
    // if (rad < 0) {
    // System.out.println("Invalid input");
    // } else {
    // int circumference = 2 * 22 / 7 * rad;
    // System.out.println("Circumference: " + circumference);
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int rad = sc.nextInt();
    // returnCircumference(rad);
    // sc.close();
    // }

    // 5. Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.

    public static void isEligible(int age) {
        if (age < 0) {
            System.out.println("Invalid input");
        } else {
            if (age > 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        isEligible(age);
        sc.close();
    }
}
