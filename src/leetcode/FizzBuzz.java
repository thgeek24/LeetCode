package leetcode;

import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("leetcode.FizzBuzz");
            else if (i % 3 == 0) list.add("Fizz");
            else if (i % 5 == 0) list.add("Buzz");
            else
                list.add(i + "");
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        List<String> list = fb.fizzBuzz(15);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
