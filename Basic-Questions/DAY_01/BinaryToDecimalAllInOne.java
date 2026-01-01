public class BinaryToDecimalAllInOne {

    // Method 1: Using while loop (manual logic)
    static int binaryToDecimalLoop(int binary) {
        int decimal = 0;
        int base = 1; // 2^0

        while (binary > 0) {
            int rem = binary % 10;
            decimal += rem * base;
            base *= 2;
            binary /= 10;
        }
        return decimal;
    }

    // Method 2: Using String traversal
    static int binaryToDecimalString(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * Math.pow(2, power++);
        }
        return decimal;
    }

    // Method 3: Using recursion
    static int binaryToDecimalRecursion(String binary, int index) {
        if (index == binary.length())
            return 0;

        int bit = binary.charAt(index) - '0';
        int power = binary.length() - index - 1;

        return bit * (int) Math.pow(2, power)
                + binaryToDecimalRecursion(binary, index + 1);
    }

    // Method 4: Using Java built-in method
    static int binaryToDecimalBuiltin(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {

        int binaryNum = 11001;
        String binaryStr = "11001";

        System.out.println("Binary : " + binaryStr);
        System.out.println("--------------------------");

        System.out.println("Using loop        : " + binaryToDecimalLoop(binaryNum));
        System.out.println("Using String      : " + binaryToDecimalString(binaryStr));
        System.out.println("Using recursion   : " + binaryToDecimalRecursion(binaryStr, 0));
        System.out.println("Using built-in    : " + binaryToDecimalBuiltin(binaryStr));
    }
}
