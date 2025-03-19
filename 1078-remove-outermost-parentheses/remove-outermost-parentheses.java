class Solution {
    public String removeOuterParentheses(String s) {  
        StringBuilder ans = new StringBuilder(); // Use StringBuilder for efficiency
        int flag = 0;

        for (char curr : s.toCharArray()) { // Convert string to char array for faster access
            if (curr == '(') {
                if (flag > 0) ans.append(curr); // Append only non-outer '('
                flag++;
            } else { 
                flag--;
                if (flag > 0) ans.append(curr); // Append only non-outer ')'
            }
        }
        return ans.toString();
    }
}
