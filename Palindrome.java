public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome sol = new Palindrome();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "No lemon, no melon";

        System.out.println("\"" + test1 + "\" → " + sol.isPalindrome(test1)); // true
        System.out.println("\"" + test2 + "\" → " + sol.isPalindrome(test2)); // false
        System.out.println("\"" + test3 + "\" → " + sol.isPalindrome(test3)); // true
    }
}
