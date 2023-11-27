package leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author taohong on 05/09/2018
 */
public class PascalTriangleTest {
    PascalTriangle pt = new PascalTriangle();

    @Test
    public void generate() {
        List<List<Integer>> list = pt.generate(2);
        for (List<Integer> inList : list) {
            System.out.println(inList);
        }
    }
}