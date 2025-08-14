class String_Great{
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - c) == 32) {
                sb.deleteCharAt(sb.length() - 1); 
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String_Great sol = new String_Great();
        String s = "leEeetcode";
        System.out.println(sol.makeGood(s)); // Output: "leetcode"
    }
}
