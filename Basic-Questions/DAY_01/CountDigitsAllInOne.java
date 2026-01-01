public class CountDigitsAllInOne {

    // Method 1: Using while loop
    static int countUsingWhile(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method 2: Using for loop
    static int countUsingFor(int num) {
        if (num == 0) return 1;
        int count = 0;
        for (; num > 0; num /= 10) {
            count++;
        }
        return count;
    }

    // Method 3: Using String conversion
    static int countUsingString(int num) {
        return String.valueOf(num).length();
    }

    // Method 4: Using log10 (Math)
    static int countUsingLog(int num) {
        if (num == 0) return 1;
        return (int) Math.log10(num) + 1;
    }

    // Method 5: Using recursion
    static int countUsingRecursion(int num) {
        if (num == 0) return 0;
        return 1 + countUsingRecursion(num / 10);
    }

    public static void main(String[] args) {

        int num = 76897;

        System.out.println("Number: " + num);
        System.out.println("-----------------------");

        System.out.println("Using while loop      : " + countUsingWhile(num));
        System.out.println("Using for loop        : " + countUsingFor(num));
        System.out.println("Using String method   : " + countUsingString(num));
        System.out.println("Using log10 method    : " + countUsingLog(num));
        System.out.println("Using recursion       : " + countUsingRecursion(num));
    }
}
