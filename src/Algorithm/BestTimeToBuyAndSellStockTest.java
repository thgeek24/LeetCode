package Algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author taohong on 05/09/2018
 */
public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bt = new BestTimeToBuyAndSellStock();

    @Test
    public void testMaxProfit1() {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bt.maxProfit(prices1));
    }

    @Test
    public void testMaxProfit2() {
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, bt.maxProfit(prices2));
    }

    @Test
    public void testMaxProfit3() {
        int[] prices3 = {7, 1, 5, 0, 3, -11, 4};
        assertEquals(15, bt.maxProfit(prices3));
    }
}