import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) continue;
            else if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else stack.push(part);
        }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) result.append("/").append(dir);
        return result.length() > 0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.simplifyPath("/home//foo/../bar/./baz/"));
    }
}
