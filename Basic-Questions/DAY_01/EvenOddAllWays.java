public class EvenOddAllWays {
    public static void main(String[] args) {

        int num = 7;   // change number here

        System.out.println("Number = " + num);

        // 1️⃣ Modulus (MOST COMMON)
        if (num % 2 == 0)
            System.out.println("Modulus : Even");
        else
            System.out.println("Modulus : Odd");

        // 2️⃣ Bitwise AND (BEST BIT METHOD)
        if ((num & 1) == 0)
            System.out.println("Bitwise AND : Even");
        else
            System.out.println("Bitwise AND : Odd");

        // 3️⃣ Division & Multiplication
        if ((num / 2) * 2 == num)
            System.out.println("Division : Even");
        else
            System.out.println("Division : Odd");

        // 4️⃣ Bitwise OR (RARE TRICK)
        if ((num | 1) > num)
            System.out.println("Bitwise OR : Even");
        else
            System.out.println("Bitwise OR : Odd");

        // 5️⃣ Bitwise XOR
        if ((num ^ 1) == num + 1)
            System.out.println("Bitwise XOR : Even");
        else
            System.out.println("Bitwise XOR : Odd");

        // 6️⃣ Using last digit (Math logic)
        if (num % 10 == 0 || num % 10 == 2 || num % 10 == 4 ||
            num % 10 == 6 || num % 10 == 8)
            System.out.println("Last Digit : Even");
        else
            System.out.println("Last Digit : Odd");
    }
}
