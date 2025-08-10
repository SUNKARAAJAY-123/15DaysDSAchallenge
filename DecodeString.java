class DecodeString{
    int idx = 0;
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;
        while (idx < s.length()) {
            char c = s.charAt(idx++);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                String inner = decodeString(s);
                while (num-- > 0) result.append(inner);
                num = 0;
            } else if (c == ']') {
                break;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        DecodeString sol = new DecodeString();
        System.out.println(sol.decodeString("3[a]2[bc]"));     // aaabcbc
        System.out.println(sol.decodeString("3[a2[c]]"));      // accaccacc
        System.out.println(sol.decodeString("2[abc]3[cd]ef")); // abcabccdcdcdef
    }
}
