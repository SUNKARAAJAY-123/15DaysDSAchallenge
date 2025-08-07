import java.util.HashSet;
import java.util.Scanner;

class ArrayisSorted{
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (!set.contains(ch)) {
                set.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        ArrayisSorted solution = new ArrayisSorted();

        
        String s1 = "abcabcbb";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s1)); // Expected: 3

        
        String s2 = "bbbbb";
        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s2)); // Expected: 1

        
        String s3 = "pwwkew";
        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s3)); // Expected: 3

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a custom string: ");
        String customInput = scanner.nextLine();
        System.out.println("Output: " + solution.lengthOfLongestSubstring(customInput));
    }
}
