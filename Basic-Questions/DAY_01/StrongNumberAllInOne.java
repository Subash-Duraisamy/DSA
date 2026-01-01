public class StrongNumberAllInOne {

    // Method 1: Nested loops (your original idea)
    static boolean isStrongNested(int num) {
        int temp = num, sum = 0;

        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            int fact = 1;
            for (int j = digit; j > 0; j--) {
                fact *= j;
            }
            sum += fact;
        }
        return sum == temp;
    }

    // Method 2: Separate factorial method (clean & reusable)
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    static boolean isStrongWithFunction(int num) {
        int temp = num, sum = 0;
        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return sum == temp;
    }

    // Method 3: Pre-computed factorials (FASTEST & BEST)
    static boolean isStrongPrecomputed(int num) {
        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int temp = num, sum = 0;

        while (num > 0) {
            sum += fact[num % 10];
            num /= 10;
        }
        return sum == temp;
    }

    // Method 4: Recursion (conceptual)
    static int factRec(int n) {
        if (n == 0) return 1;
        return n * factRec(n - 1);
    }

    static int strongSumRec(int n) {
        if (n == 0) return 0;
        return factRec(n % 10) + strongSumRec(n / 10);
    }

    static boolean isStrongRecursion(int num) {
        return strongSumRec(num) == num;
    }

    // Method 5: String conversion (easy)
    static boolean isStrongString(int num) {
        String s = String.valueOf(num);
        int sum = 0;

        for (char c : s.toCharArray()) {
            sum += factorial(c - '0');
        }
        return sum == num;
    }

    public static void main(String[] args) {

        int num = 145;

        System.out.println("Number : " + num);
        System.out.println("------------------------------");

        System.out.println("Nested loops        : " + isStrongNested(num));
        System.out.println("Using function      : " + isStrongWithFunction(num));
        System.out.println("Pre-computed fact   : " + isStrongPrecomputed(num));
        System.out.println("Recursion           : " + isStrongRecursion(num));
        System.out.println("String method       : " + isStrongString(num));
    }
}
