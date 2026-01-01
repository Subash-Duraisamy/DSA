import java.time.Year;

public class LeapYearAllInOne {

    // Method 1: Standard logical method (BEST & MOST ASKED)
    static boolean isLeapStandard(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    // Method 2: Single condition (compact)
    static boolean isLeapSingleCondition(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method 3: Using ternary operator
    static String isLeapTernary(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                ? "Leap Year"
                : "Not Leap Year";
    }

    // Method 4: Using Java built-in API (Year class)
    static boolean isLeapUsingAPI(int year) {
        return Year.isLeap(year);
    }

    // Method 5: Using if-else ladder (beginner friendly)
    static boolean isLeapIfElse(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else if (year % 400 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int year = 2024;

        System.out.println("Year : " + year);
        System.out.println("--------------------------");

        System.out.println("Standard logic      : " + isLeapStandard(year));
        System.out.println("Single condition    : " + isLeapSingleCondition(year));
        System.out.println("Ternary operator    : " + isLeapTernary(year));
        System.out.println("Java API method     : " + isLeapUsingAPI(year));
        System.out.println("If-Else ladder      : " + isLeapIfElse(year));
    }
}
