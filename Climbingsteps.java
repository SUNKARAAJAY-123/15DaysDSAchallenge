class Climbingsteps {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2; // ways to climb to step 1 and step 2
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Climbingsteps sol = new Climbingsteps();
        int n = 3; // example input
        System.out.println(sol.climbStairs(n)); // expected output: 3
    }
}
