import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] input2 = {""};
        String[] input3 = {"a"};

        System.out.println("Output 1: " + sol.groupAnagrams(input1));
        System.out.println("Output 2: " + sol.groupAnagrams(input2));
        System.out.println("Output 3: " + sol.groupAnagrams(input3));
    }
}
