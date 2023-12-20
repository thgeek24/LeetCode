/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 5
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/20 11:19
 */
public class LongestPalindromicSubstring_5 {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String res1 = longestPalindrome(s, i, i);
            String res2 = longestPalindrome(s, i, i + 1);
            String _res = res1.length() > res2.length() ? res1 : res2;
            res = _res.length() > res.length() ? _res : res;
        }
        return res;
    }

    private String longestPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static void main(String[] args) {
        String str = "babad";
        LongestPalindromicSubstring_5 test = new LongestPalindromicSubstring_5();
        String res = test.longestPalindrome(str);
        System.out.println(res);
    }
}