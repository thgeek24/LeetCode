package Algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author taohong on 21/09/2018
 */
public class BestTimeToBuyAndSellStockIITest {
    BestTimeToBuyAndSellStockII bt = new BestTimeToBuyAndSellStockII();

    @Test
    public void testMaxProfit1() {
        int[] test1 = {7, 1, 5, 3, 6, 4};
        assertEquals(7, bt.maxProfit(test1));
    }

    @Test
    public void testMaxProfit2() {
        int[] test2 = {1, 2, 3, 4, 5};
        assertEquals(4, bt.maxProfit(test2));
    }

    @Test
    public void testMaxProfit3() {
        int[] test3 = {7, 6, 4, 3, 1};
        assertEquals(0, bt.maxProfit(test3));
    }
}