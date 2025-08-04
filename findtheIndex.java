class findtheIndex {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findtheIndex sol = new findtheIndex();
        String haystack = "hello";
        String needle = "ll";
        int result = sol.strStr(haystack, needle);
        System.out.println("Index: " + result);
    }
}
