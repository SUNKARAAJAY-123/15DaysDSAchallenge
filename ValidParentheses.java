import java.util.Scanner;

class ValidParentheses {
    public boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String input = sc.nextLine();

        ValidParentheses sol = new ValidParentheses();
        boolean result = sol.isValid(input);

        System.out.println("Is the bracket sequence valid? " + result);
    }
}
