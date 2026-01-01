public class ArmstrongAllInOne {

    // Method 1: Pure mathematical way (BEST & GENERAL)
    static boolean isArmstrongMath(int num) {
        int temp = num;
        int digits = 0;
        int t = num;

        // Count digits
        while (t > 0) {
            digits++;
            t /= 10;
        }

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }

        return sum == temp;
    }

    // Method 2: Using String
    static boolean isArmstrongString(int num) {
        String s = String.valueOf(num);
        int sum = 0;

        for (char c : s.toCharArray()) {
            sum += Math.pow(c - '0', s.length());
        }

        return sum == num;
    }

    // Method 3: Using Recursion
    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    static int armstrongRec(int n, int digits) {
        if (n == 0) return 0;
        return (int) Math.pow(n % 10, digits) + armstrongRec(n / 10, digits);
    }

    static boolean isArmstrongRecursion(int num) {
        int digits = countDigits(num);
        return armstrongRec(num, digits) == num;
    }

    // Method 4: Java 8 Stream
    static boolean isArmstrongStream(int num) {
        String s = String.valueOf(num);
        int sum = s.chars()
                   .map(c -> (int) Math.pow(c - '0', s.length()))
                   .sum();
        return sum == num;
    }

    // Method 5: Optimized for 3-digit numbers
    static boolean isArmstrong3Digit(int num) {
        if (num < 100 || num > 999) return false;
        int temp = num;

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;

        return a * a * a + b * b * b + c * c * c == temp;
    }

    public static void main(String[] args) {

        int num = 153;

        System.out.println("Number : " + num);
        System.out.println("-----------------------------");

        System.out.println("Math method       : " + isArmstrongMath(num));
        System.out.println("String method     : " + isArmstrongString(num));
        System.out.println("Recursion method  : " + isArmstrongRecursion(num));
        System.out.println("Stream method     : " + isArmstrongStream(num));
        System.out.println("3-digit optimized : " + isArmstrong3Digit(num));
    }
}
