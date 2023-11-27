package leetcode;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//                if (haystack.substring(i, i + needle.length()).equals(needle))
//                    return i;
                int k = i;

                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(k++) != needle.charAt(j)) {
                        break;
                    }
                    if (j == needle.length() - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr iss = new ImplementStrStr();
        String haystack = "miss";
        String needle = "miss";
        System.out.println(iss.strStr(haystack, needle));
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
    }
}
