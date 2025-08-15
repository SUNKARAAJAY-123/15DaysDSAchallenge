public class Powerof2 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Powerof2 sol = new Powerof2();
        
        int[] testNumbers = {1, 2, 3, 4, 8, 16, 18, 32, 0, -2};
        
        for (int num : testNumbers) {
            System.out.println(num + " -> " + sol.isPowerOfTwo(num));
        }
    }
}
