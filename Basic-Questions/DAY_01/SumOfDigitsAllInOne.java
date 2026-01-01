public class SumOfDigitsAllInOne {

    // Method 1: Using while loop
    static int sumUsingWhile(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Method 2: Using for loop
    static int sumUsingFor(int num) {
        int sum = 0;
        for (; num > 0; num /= 10) {
            sum += num % 10;
        }
        return sum;
    }

    // Method 3: Using recursion
    static int sumUsingRecursion(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + sumUsingRecursion(num / 10);
    }

    // Method 4: Using String conversion
    static int sumUsingString(int num) {
        int sum = 0;
        for (char c : String.valueOf(num).toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

    // Method 5: Using Java 8 Streams
    static int sumUsingStream(int num) {
        return String.valueOf(num)
                     .chars()
                     .map(c -> c - '0')
                     .sum();
    }

    public static void main(String[] args) {

        int num = 7894;

        System.out.println("Number : " + num);
        System.out.println("------------------------");

        System.out.println("Using while loop     : " + sumUsingWhile(num));
        System.out.println("Using for loop       : " + sumUsingFor(num));
        System.out.println("Using recursion      : " + sumUsingRecursion(num));
        System.out.println("Using String method  : " + sumUsingString(num));
        System.out.println("Using Stream method  : " + sumUsingStream(num));
    }
}
