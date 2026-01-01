import java.util.Arrays;

public class PrintNPrimesSieve {

    public static void main(String[] args) {

        int n = 10;

        int limit = (int)(n * (Math.log(n) + Math.log(Math.log(n)))) + 3;
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= limit && count < n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
