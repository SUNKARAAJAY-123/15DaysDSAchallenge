import java.util.Arrays;

class  KthLargest{
    static int findKthLargest(int[] arr, int k) {
        // Sort array in ascending order
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n - k]; // K-th largest is at index (n-k)
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("The " + k1 + "-th largest element is: " + findKthLargest(arr1, k1)); // Output: 5

        // Example 2
        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 3;
        System.out.println("The " + k2 + "-th largest element is: " + findKthLargest(arr2, k2)); // Output: 10

        // Example 3
        int[] arr3 = {2, 1};
        int k3 = 1;
        System.out.println("The " + k3 + "-th largest element is: " + findKthLargest(arr3, k3)); // Output: 2
    }
}
