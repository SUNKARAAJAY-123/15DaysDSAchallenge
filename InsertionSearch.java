class InsertionSearch{
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return left;
    }

    public static void main(String[] args) {
        InsertionSearch solution = new InsertionSearch();

        
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Input: target = " + target1);
        System.out.println("Output: " + solution.searchInsert(nums1, target1)); // Output: 2

        int target2 = 2;
        System.out.println("\nInput: target = " + target2);
        System.out.println("Output: " + solution.searchInsert(nums1, target2));

        int target3 = 7;
        System.out.println("\nInput: target = " + target3);
        System.out.println("Output: " + solution.searchInsert(nums1, target3)); 
    }
}

