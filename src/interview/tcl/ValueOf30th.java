/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview.tcl;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/30 10:21
 */
public class ValueOf30th {
    //a0 = 0, a1 = 0, a2 = 1
    //a(n) = a(n-1) + a(n-2) + a(n-3)
    public Long compute() {
        long a0 = 0;
        long a1 = 0;
        long a2 = 1;
        for (int i = 0; i < 27; i++) {
            long tmp = a0 + a1 + a2;
            a0 = a1;
            a1 = a2;
            a2 = tmp;
        }
        return a2;
    }

    public static void main(String[] args) {
        Long value = new ValueOf30th().compute();
        System.out.println(value);
    }
}
