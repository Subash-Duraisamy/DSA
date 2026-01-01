public class TrailingZerosAllInOne {

    // Method 1: Optimal method (COUNT FACTORS OF 5) ⭐⭐⭐⭐⭐
    static int countZerosOptimal(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }

    // Method 2: Using while loop (same logic, different style)
    static int countZerosWhile(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    // Method 3: Brute force (calculate factorial) ❌ NOT recommended
    static int countZerosBrute(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact /= 10;
        }
        return count;
    }

    // Method 4: Recursive method (based on factor of 5)
    static int countZerosRecursion(int n) {
        if (n < 5)
            return 0;
        return n / 5 + countZerosRecursion(n / 5);
    }

    public static void main(String[] args) {

        int n = 100;

        System.out.println("Number : " + n);
        System.out.println("----------------------------");

        System.out.println("Optimal method     : " + countZerosOptimal(n));
        System.out.println("While loop method  : " + countZerosWhile(n));
        System.out.println("Recursive method   : " + countZerosRecursion(n));

        // Brute force only for small n
        System.out.println("Brute force method : " + countZerosBrute(10));
    }
}
