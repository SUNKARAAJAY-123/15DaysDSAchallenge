public class minbitflip {
    public int minBitFlips(int start, int goal) {
        // XOR will mark bits that are different as 1
        int xorValue = start ^ goal;

        // Count the number of 1 bits in xorValue
        int count = 0;
        while (xorValue > 0) {
            count += xorValue & 1; // Check last bit
            xorValue >>= 1;        // Shift right
        }
        return count;
    }

    public static void main(String[] args) {
        minbitflip sol = new minbitflip();

        int start = 10; // 1010
        int goal = 7;   // 0111

        System.out.println("Minimum bit flips: " + sol.minBitFlips(start, goal));
    }
}
