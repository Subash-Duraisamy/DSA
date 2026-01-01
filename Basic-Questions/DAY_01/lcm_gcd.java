public class lcm_gcd{

    // Method 1: GCD using Euclidean Algorithm (BEST)
    static int gcdEuclid(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    // Method 2: GCD using recursion (Euclidean)
    static int gcdRecursion(int a, int b) {
        if (b == 0)
            return a;
        return gcdRecursion(b, a % b);
    }

    // Method 3: GCD using brute force (basic)
    static int gcdBrute(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // Method 4: LCM using formula
    static int lcmUsingGcd(int a, int b) {
        return (a * b) / gcdEuclid(a, b);
    }

    // Method 5: LCM using loop (basic)
    static int lcmBrute(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0)
                return max;
            max++;
        }
    }

    public static void main(String[] args) {

        int a = 36;
        int b = 60;

        System.out.println("Numbers: " + a + " , " + b);
        System.out.println("----------------------------");

        System.out.println("GCD (Euclidean)     : " + gcdEuclid(a, b));
        System.out.println("GCD (Recursion)    : " + gcdRecursion(a, b));
        System.out.println("GCD (Brute Force)  : " + gcdBrute(a, b));

        System.out.println("LCM (Using GCD)    : " + lcmUsingGcd(a, b));
        System.out.println("LCM (Brute Force)  : " + lcmBrute(a, b));
    }
}
