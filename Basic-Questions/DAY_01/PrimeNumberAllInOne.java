import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumberAllInOne {

    // Method 1: Basic approach (1 to n-1)
    static boolean isPrimeBasic(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method 2: Optimized √n approach (BEST)
    static boolean isPrimeSqrt(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method 3: Skip even numbers
    static boolean isPrimeSkipEven(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method 4: Using recursion
    static boolean isPrimeRecursion(int num, int i) {
        if (num <= 1) return false;
        if (i * i > num) return true;
        if (num % i == 0) return false;
        return isPrimeRecursion(num, i + 1);
    }

    // Method 5: Using Java 8 Streams
    static boolean isPrimeStream(int num) {
        if (num <= 1) return false;
        return IntStream
                .rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);
    }

    // Method 6: Sieve of Eratosthenes (for range)
    static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        int num = 57;

        System.out.println("Number : " + num);
        System.out.println("-------------------------------");

        System.out.println("Basic method        : " + isPrimeBasic(num));
        System.out.println("√n optimized method : " + isPrimeSqrt(num));
        System.out.println("Skip even method    : " + isPrimeSkipEven(num));
        System.out.println("Recursion method    : " + isPrimeRecursion(num, 2));
        System.out.println("Stream method       : " + isPrimeStream(num));

        System.out.println("\nSieve (0–100):");
        boolean[] primes = sieve(100);
        for (int i = 2; i <= 100; i++) {
            if (primes[i]) System.out.print(i + " ");
        }
    }
}
