public class FibonacciAllInOne {

    // Method 1: Using for loop (BEST & MOST COMMON)
    static void fibUsingFor(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Method 2: Using while loop
    static void fibUsingWhile(int n) {
        int a = 0, b = 1, count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println();
    }

    // Method 3: Using recursion (slow – conceptual)
    static int fibRec(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static void fibUsingRecursion(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }
        System.out.println();
    }

    // Method 4: Using array (DP idea)
    static void fibUsingArray(int n) {
        if (n <= 0) return;

        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    // Method 5: Memoization (Optimized recursion – DP)
    static int[] dp = new int[100];

    static int fibMemo(int n) {
        if (n <= 1) return n;
        if (dp[n] != 0) return dp[n];
        return dp[n] = fibMemo(n - 1) + fibMemo(n - 2);
    }

    static void fibUsingMemo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibMemo(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Fibonacci Series (First " + n + " terms)");
        System.out.println("----------------------------------");

        System.out.print("For loop        : ");
        fibUsingFor(n);

        System.out.print("While loop      : ");
        fibUsingWhile(n);

        System.out.print("Recursion       : ");
        fibUsingRecursion(n);

        System.out.print("Array (DP)      : ");
        fibUsingArray(n);

        System.out.print("Memoization     : ");
        fibUsingMemo(n);
    }
}
