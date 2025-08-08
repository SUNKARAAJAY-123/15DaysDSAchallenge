import java.util.*;

class Pattern132{
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int second = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < second) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop(); 
            }

            stack.push(nums[i]); 
        }

        return false;
    }

    public static void main(String[] args) {
        Pattern132 solution = new Pattern132();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 1, 4, 2};
        int[] nums3 = {-1, 3, 2, 0};

        System.out.println("Example 1: " + solution.find132pattern(nums1)); // false
        System.out.println("Example 2: " + solution.find132pattern(nums2)); // true
        System.out.println("Example 3: " + solution.find132pattern(nums3)); // true
    }
}
