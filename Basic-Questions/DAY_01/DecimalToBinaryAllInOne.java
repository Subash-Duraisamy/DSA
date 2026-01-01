public class DecimalToBinaryAllInOne {

    // Method 1: Using while loop (manual logic)
    static int binaryUsingLoop(int decimal) {
        if (decimal == 0) return 0;

        int binary = 0;
        int place = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * place;
            place *= 10;
            decimal /= 2;
        }
        return binary;
    }

    // Method 2: Using StringBuilder (safe for large numbers)
    static String binaryUsingString(int decimal) {
        if (decimal == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }
        return sb.reverse().toString();
    }

    // Method 3: Using recursion
    static void binaryUsingRecursion(int decimal) {
        if (decimal == 0) return;
        binaryUsingRecursion(decimal / 2);
        System.out.print(decimal % 2);
    }

    // Method 4: Using Java built-in method
    static String binaryUsingBuiltin(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {

        int decimal = 25;

        System.out.println("Decimal : " + decimal);
        System.out.println("--------------------------");

        System.out.println("Using loop        : " + binaryUsingLoop(decimal));
        System.out.println("Using String      : " + binaryUsingString(decimal));

        System.out.print("Using recursion   : ");
        if (decimal == 0) System.out.print(0);
        else binaryUsingRecursion(decimal);
        System.out.println();

        System.out.println("Using built-in    : " + binaryUsingBuiltin(decimal));
    }
}
