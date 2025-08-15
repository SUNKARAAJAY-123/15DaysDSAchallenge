public class countofprimes {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            isPrime[i] = true; // Only mark odd numbers as true initially
        }

        int count = 1; // Start with prime number 2

        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        countofprimes sol = new countofprimes();

        int n = 20;
        System.out.println("Number of primes less than " + n + ": " + sol.countPrimes(n));
    }
}
