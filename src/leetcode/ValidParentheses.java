package leetcode;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!parenStack.empty()) {
                if ((parenStack.peek() == '(' && s.charAt(i) == ')') ||
                        (parenStack.peek() == '[' && s.charAt(i) == ']') || (parenStack.peek() == '{' && s.charAt(i) == '}')) {
                    parenStack.pop();
                } else {
                    parenStack.push(s.charAt(i));
                }
            } else {
                parenStack.push(s.charAt(i));
            }
        }
        return (parenStack.empty());
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(args[0]);
        System.out.println(vp.isValid(args[0]));
    }
}
