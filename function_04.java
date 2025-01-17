import java.util.Scanner;

public class function_04 {

    public static long calculateFactorial(long num) {
        long result = 1; // We use long for factorial of large numbers

        for (long i = num; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}
