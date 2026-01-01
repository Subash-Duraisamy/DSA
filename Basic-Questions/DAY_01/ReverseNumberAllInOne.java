import java.util.Stack;

public class ReverseNumberAllInOne {

    // Method 1: Using while loop (BEST & MOST COMMON)
    static int reverseUsingWhile(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    // Method 2: Using for loop
    static int reverseUsingFor(int num) {
        int rev = 0;
        for (; num > 0; num /= 10) {
            rev = rev * 10 + (num % 10);
        }
        return rev;
    }

    // Method 3: Using StringBuilder
    static String reverseUsingString(int num) {
        return new StringBuilder(String.valueOf(num))
                .reverse()
                .toString();
    }

    // Method 4: Using recursion (prints reverse)
    static void reverseUsingRecursion(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        }
        System.out.print(num % 10);
        reverseUsingRecursion(num / 10);
    }

    // Method 5: Using Stack
    static void reverseUsingStack(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 10);
            num /= 10;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {

        int num = 1234;

        System.out.println("Number : " + num);
        System.out.println("--------------------------");

        System.out.println("Using while loop    : " + reverseUsingWhile(num));
        System.out.println("Using for loop      : " + reverseUsingFor(num));
        System.out.println("Using String method : " + reverseUsingString(num));

        System.out.print("Using recursion     : ");
        reverseUsingRecursion(num);
        System.out.println();

        System.out.print("Using Stack         : ");
        reverseUsingStack(num);
    }
}
