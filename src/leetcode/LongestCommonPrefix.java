package leetcode;public class LongestCommonPrefix {    public String longestCommonPrefix(String[] strs) {        String result = "";        if (strs.length == 0) {            return result;        }        int minLen = strs[0].length(); // Set the default minimal length of string by the length of the first given string        int minIndex = 0;        for (int i = 0; i < strs.length; i++) { // Assign the length and index of the first shortest string            if (minLen > strs[i].length()) {                minLen = strs[i].length();                minIndex = i;            }        }        String tmp = strs[minIndex];        strs[minIndex] = strs[0];        strs[0] = tmp;        for (int j = 1; j <= minLen; j++) {            String tmpResult = strs[0].substring(0, j); // Initialize the first string to check//                System.out.println("tmpResult is: " + tmpResult);            // Main code to find longest common prefix            boolean isCommon = true;            for (String str : strs) {                if (!str.substring(0, j).equals(tmpResult)) {                    isCommon = false;                    break;                }            }            if (isCommon) {                if (result.equals("")) {                    result = tmpResult;                } else {                    if (result.length() < tmpResult.length()) {                        result = tmpResult;                    }                }            } else {                break;            }        }        return result;    }    public static void main(String[] args) {        for (String str : args) {            System.out.print(str + " ");        }        System.out.println();        LongestCommonPrefix lcp = new LongestCommonPrefix();        System.out.println("The longest common prefix is: " + lcp.longestCommonPrefix(args));    }}