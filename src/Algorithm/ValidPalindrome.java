package Algorithm;

/**
 * @author taohong on 22/09/2018
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i <= s.length() - 1 && !isAlphanumeric(s.charAt(i))) i++;
            while (j >= 0 && !isAlphanumeric(s.charAt(j))) j--;
            if (i > j)
                return true;
            if (s.charAt(i) == s.charAt(j) || s.charAt(i) >= 65 && s.charAt(j) >= 65 && Math.abs(s.charAt(i) - s.charAt(j)) == 32) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        return c >= 48 && c <= 57 || c >= 65 && c <= 90 || c >= 97 && c <= 122;
    }
}


