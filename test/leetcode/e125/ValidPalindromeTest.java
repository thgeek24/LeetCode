/*
 * Copyright (c) 2018-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e125;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link ValidPalindrome}
 *
 * @author taohong on 22/09/2018
 */
public class ValidPalindromeTest {
    ValidPalindrome vp = new ValidPalindrome();

    @Test
    public void testIsPalindrome1() {
        String str1 = "A man, a plan, a canal: Panama";
        assertTrue(vp.isPalindrome(str1));
    }

    @Test
    public void testIsPalindrome2() {
        String str2 = "race a car";
        assertFalse(vp.isPalindrome(str2));
    }

    @Test
    public void testIsPalindrome3() {
        String str3 = "Mm";
        assertTrue(vp.isPalindrome(str3));
    }

    @Test
    public void testIsPalindrome4() {
        String str4 = ".,";
        assertTrue(vp.isPalindrome(str4));
    }

    @Test
    public void testIsPalindrome5() {
        String str5 = "0P";
        assertFalse(vp.isPalindrome(str5));
    }

    @Test
    public void testIsPalindrome6() {
        String str5 = "  ";
        assertTrue(vp.isPalindrome(str5));
    }

    @Test
    public void testIsPalindrome7() {
        String str5 = "a";
        assertTrue(vp.isPalindrome(str5));
    }

    @Test
    public void testIsPalindrome8() {
        String str6 = "Zeus was deified, saw Suez.";
        assertTrue(vp.isPalindrome(str6));
    }

    @Test
    public void testIsAN() {
        char c = '.';
        System.out.println(vp.isAlphanumeric(c));
    }
}