import java.util.Arrays;

public class Practical6 {

    // Factorial using for loop
    public static int factorialForLoop(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Factorial using while loop
    public static int factorialWhileLoop(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    // Factorial using recursion (without loop)
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Sum of array elements using recursion (without loop)
    public static int getSum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return numbers[numbers.length - 1] + getSum(Arrays.copyOf(numbers, numbers.length - 1));
    }

    public static void main(String[] args) {
        int num = 5;
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Factorial using for loop: " + factorialForLoop(num));
        System.out.println("Factorial using while loop: " + factorialWhileLoop(num));
        System.out.println("Factorial using recursion: " + factorial(num));
        System.out.println("Sum of array elements: " + getSum(arr));
    }
}

