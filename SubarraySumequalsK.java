import java.util.*;

public class SubarraySumequalsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int n : nums) {
            sum += n;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3};
        int k = 3;

        SubarraySumequalsK sol = new SubarraySumequalsK();
        int result = sol.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result); 
        // Expected output: 2
    }
}
