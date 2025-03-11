/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m38;

public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = countString(result);
        }
        return result;
    }

    public String countString(String s) {
        char candidate = s.charAt(0);
        int count = 0;
        String tmpRes = "";
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == candidate) {
                count++;
            } else {
                tmpRes = tmpRes + count + String.valueOf(s.charAt(i - 1));
                candidate = s.charAt(i);
                count = 1;
            }
            if (i == s.length() - 1) {
                tmpRes = tmpRes + count + String.valueOf(s.charAt(i));
            }
        }
        return tmpRes;
    }
}
