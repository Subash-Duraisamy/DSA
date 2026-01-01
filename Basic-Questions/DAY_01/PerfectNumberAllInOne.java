import java.util.stream.IntStream;

public class PerfectNumberAllInOne {

    // Method 1: Basic method (1 to num/2)
    static boolean isPerfectBasic(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    // Method 2: Optimized √n method (BEST)
    static boolean isPerfectOptimized(int num) {
        if (num <= 1) return false;

        int sum = 1; // 1 is always a divisor
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i)
                    sum += num / i;
            }
        }
        return sum == num;
    }

    // Method 3: Using recursion (conceptual)
    static int divisorSumRec(int num, int i) {
        if (i > num / 2) return 0;
        if (num % i == 0)
            return i + divisorSumRec(num, i + 1);
        return divisorSumRec(num, i + 1);
    }

    static boolean isPerfectRecursion(int num) {
        return divisorSumRec(num, 1) == num;
    }

    // Method 4: Using Java 8 Streams
    static boolean isPerfectStream(int num) {
        int sum = IntStream
                .rangeClosed(1, num / 2)
                .filter(i -> num % i == 0)
                .sum();
        return sum == num;
    }

    // Method 5: Mathematical property (theory-based)
    static boolean isPerfectMath(int num) {
        int[] knownPerfects = {6, 28, 496, 8128, 33550336};
        for (int p : knownPerfects) {
            if (num == p) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int num = 496;

        System.out.println("Number : " + num);
        System.out.println("-------------------------------");

        System.out.println("Basic method        : " + isPerfectBasic(num));
        System.out.println("Optimized √n method : " + isPerfectOptimized(num));
        System.out.println("Recursion method    : " + isPerfectRecursion(num));
        System.out.println("Stream method       : " + isPerfectStream(num));
        System.out.println("Math property check : " + isPerfectMath(num));
    }
}
