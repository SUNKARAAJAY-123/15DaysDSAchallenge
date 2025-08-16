class LargestOddnum{
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0 && ((num.charAt(i) - '0') % 2 == 0)) {
            i--; // skip even digits
        }
        return (i >= 0) ? num.substring(0, i + 1) : "";
    }

    // Main method for testing
    public static void main(String[] args) {
        LargestOddnum sol = new LargestOddnum();

        System.out.println(sol.largestOddNumber("52"));      // Output: 5
        System.out.println(sol.largestOddNumber("4206"));    // Output: ""
        System.out.println(sol.largestOddNumber("35427"));   // Output: 35427
        System.out.println(sol.largestOddNumber("123456"));  // Output: 12345
    }
}
