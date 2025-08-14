class Make_The_String_Great {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[s.length()];
        
        for (char c : s.toCharArray()) {
            sb.append(c);
            int last = sb.length() - 1;
            
            if (last > 0 && sb.charAt(last) == sb.charAt(last - 1)) {
                count[last] = count[last - 1] + 1;
            } else {
                count[last] = 1;
            }
            
            if (count[last] == k) {
                sb.delete(sb.length() - k, sb.length());
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Make_The_String_Great sol = new Make_The_String_Great();
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(sol.removeDuplicates(s, k)); // Output: "aa"
    }
}
