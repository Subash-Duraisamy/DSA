public class PowerOfNumberAllInOne {

    // Method 1: Using loop (MOST COMMON & INTERVIEW-FRIENDLY)
    static long powerUsingLoop(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    // Method 2: Using recursion
    static long powerUsingRecursion(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * powerUsingRecursion(base, exp - 1);
    }

    // Method 3: Using Math.pow()
    static long powerUsingMath(int base, int exp) {
        return (long) Math.pow(base, exp);
    }

    // Method 4: Fast Exponentiation (BEST & OPTIMIZED)
    static long powerFast(int base, int exp) {
        if (exp == 0) return 1;

        long half = powerFast(base, exp / 2);

        if (exp % 2 == 0)
            return half * half;
        else
            return base * half * half;
    }

    // Method 5: Using while loop (bitwise idea)
    static long powerUsingBitwise(int base, int exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {   // if exponent is odd
                result *= base;
            }
            base *= base;
            exp >>= 1;             // exp = exp / 2
        }
        return result;
    }

    public static void main(String[] args) {

        int base = 2;
        int exp = 10;

        System.out.println("Base : " + base);
        System.out.println("Exponent : " + exp);
        System.out.println("--------------------------");

        System.out.println("Using loop        : " + powerUsingLoop(base, exp));
        System.out.println("Using recursion   : " + powerUsingRecursion(base, exp));
        System.out.println("Using Math.pow    : " + powerUsingMath(base, exp));
        System.out.println("Fast exponentiation: " + powerFast(base, exp));
        System.out.println("Bitwise method    : " + powerUsingBitwise(base, exp));
    }
}
