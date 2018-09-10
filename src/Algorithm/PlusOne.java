package Algorithm;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        int[] result = new int[digits.length + 1];
        result[digits.length] = 0;
        int flag = 1;

        for (int i = digits.length - 2; i > 0; i--) {
            if (digits[i] == 9 && flag == 1) {
                result[i + 1] = 0;
                flag = 1;
            } else {
                result[i + 1] = digits[i] + flag;
                flag = 0;
            }
        }
        if (digits[0] == 9 && flag == 1) {
            result[1] = 0;
            result[0] = 1;
            return result;
        } else {
            result[1] = digits[0] + flag;
            return Arrays.copyOfRange(result, 1, result.length);
        }
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] intArr = {1, 9, 3, 9};
        for (int i : po.plusOne(intArr)) {
            System.out.println(i);
        }
    }
}
