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

    // public static void isEligible(int age) {
    // if (age < 0) {
    // System.out.println("Invalid input");
    // } else {
    // if (age > 18) {
    // System.out.println("Eligible to vote");
    // } else {
    // System.out.println("Not eligible to vote");
    // }
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    // isEligible(age);
    // sc.close();
    // }

    // 6. Write an infinite loop using do while condition.
    // public static void main(String[] args) {
    // int n = 1;
    // do {
    // System.out.println(n);
    // n++;
    // } while (n > 0);
    // }

    // 7. Write a program to enter the numbers till the user wants and at the end it
    // should display the count of positive, negative and zeros entered.
    // public static void countParameters() {
    //     int positive = 0, negative = 0, zeroes = 0;

    //     while (true) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter Your num: ");
    //         String input = sc.next();

    //         if (input.equals("STOP") || input.equals("stop")) {
    //             break;
    //         }

    //         int num;

    //         try {
    //             num = Integer.valueOf(input);
    //         } catch (Exception e) {
    //             System.out.println("Invalid Number");
    //             continue;
    //         }

    //         if (num > 0) {
    //             positive++;
    //         } else if (num < 0) {
    //             negative++;
    //         } else if (num == 0) {
    //             zeroes++;
    //         }
    //     }

    //     System.out.print(
    //             "You have entered " + positive + " Positive, " + negative + " Negative, and " + zeroes + " Zeros.");
    // }

    // public static void main(String[] args) {
    //     countParameters();
    // }

    // public static void main(String[] args) {

    // }


    // 8. Two numbers are entered by the user, x and n. Write a function to find the
    // value of one number raised to the power of another i.e. xn.

    // public static void calculateNumExpo(int x, int n) {
    // if (x > 0 && x > 0) {
    // System.out.println((int) Math.pow(x, n));
    // } else {
    // System.out.println("Invalid input");
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // int n = sc.nextInt();
    // calculateNumExpo(x, n);
    // sc.close();
    // }

    // 9. Write a function that calculates the Greatest Common Divisor of 2 numbers.

    // public static void greatestDivisor(int a, int b) {
    // int tempNum = Math.min(a, b);
    // int result = 0;
    // for (int i = 1; i <= tempNum; i++) {
    // if (a % i == 0 && b % i == 0) {
    // result = i;
    // }
    // }
    // System.out.println(result);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // greatestDivisor(a, b);
    // sc.close();
    // }

    // 10. Write a program to print Fibonacci series of n terms where n is input by
    // user :
    // 0 1 1 2 3 5 8 13 21 .....
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that
    // came before it.
    public static void fibonacciSeries(int n) {
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 0; i <= n-1; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fibonacciSeries(n);
    sc.close();
    }
}