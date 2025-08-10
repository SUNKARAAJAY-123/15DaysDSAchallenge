class BasicCalculator {
    public int calculate(String s) {
        int num = 0, lastNum = 0, result = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) num = num * 10 + (c - '0');
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (sign == '+') {
                    result += lastNum;
                    lastNum = num;
                } else if (sign == '-') {
                    result += lastNum;
                    lastNum = -num;
                } else if (sign == '*') {
                    lastNum *= num;
                } else if (sign == '/') {
                    lastNum /= num;
                }
                sign = c;
                num = 0;
            }
        }
        result += lastNum;
        return result;
    }

    public static void main(String[] args) {
        BasicCalculator sol = new BasicCalculator();
        System.out.println(sol.calculate("3+2*2"));     // 7
        System.out.println(sol.calculate(" 3/2 "));     // 1
        System.out.println(sol.calculate(" 3+5 / 2 ")); // 5
    }
}
