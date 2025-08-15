public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found target
            } else if (target < nums[mid]) {
                right = mid - 1; // search left half
            } else {
                left = mid + 1; // search right half
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();
        
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        
        int result = sol.search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
