import java.util.*;

class AssignCoolies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0; // pointer for children
        int j = 0; // pointer for cookies
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { 
                i++; // child satisfied
            }
            j++; // move to next cookie
        }
        
        return i; // number of satisfied children
    }

    // Test
    public static void main(String[] args) {
        AssignCoolies sol = new AssignCoolies();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(sol.findContentChildren(g, s)); // Output: 1
    }
}
