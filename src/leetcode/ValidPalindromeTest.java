package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author taohong on 22/09/2018
 */
public class ValidPalindromeTest {
    ValidPalindrome vp = new ValidPalindrome();

    @Test
    public void testIsPalindrome1() {
        String str1 = "A man, a plan, a canal: Panama";
        assertEquals(true, vp.isPalindrome(str1));
    }

    @Test
    public void testIsPalindrome2() {
        String str2 = "race a car";
        assertEquals(false, vp.isPalindrome(str2));
    }

    @Test
    public void testIsPalindrome3() {
        String str3 = "Mm";
        assertEquals(true, vp.isPalindrome(str3));
    }

    @Test
    public void testIsPalindrome4() {
        String str4 = ".,";
        assertEquals(true, vp.isPalindrome(str4));
    }

    @Test
    public void testIsPalindrome5() {
        String str5 = "0P";
        assertEquals(false, vp.isPalindrome(str5));
    }

    @Test
    public void testIsPalindrome6() {
        String str5 = "  ";
        assertEquals(true, vp.isPalindrome(str5));
    }

    @Test
    public void testIsPalindrome7() {
        String str5 = "a";
        assertEquals(true, vp.isPalindrome(str5));
    }

    @Test
    public void testIsPalindrome8() {
        String str6 = "Zeus was deified, saw Suez.";
        assertEquals(true, vp.isPalindrome(str6));
    }

    @Test
    public void testIsAN() {
        char c = '.';
        System.out.println(vp.isAlphanumeric(c));
    }


}