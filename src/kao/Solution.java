package kao;

import java.util.ArrayList;

class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> pris = new ArrayList<>();
        int max = -1, min = 10000, pMin = 0, pMax = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                pris.add(prices[i]);
                if (min > prices[i]) {
                    min = prices[i];
                    pMin = pris.size() - 1;
                }
            } else if (i > 0 && prices[i] > prices[i - 1]) {
                pris.add(prices[i]);
                if (prices[i] >= max) {
                    max = prices[i];
                    pMax = pris.size() - 1;
                }
            }
        }
        if (pris.size() <= 1) {
            return 0;
        }
        if (pMin < pMax) {
            return max - min;
        }
        int i = 0, j = pris.size() - 1, tmpMax = -1, tmpMin = 10000;
        while (i < pMax) {
            tmpMin = Math.min(pris.get(i), tmpMin);
            i++;
        }
        while (j > pMin) {
            tmpMax = Math.max(pris.get(j), tmpMax);
            j--;
        }
        return Math.max(tmpMax - min, max - tmpMin);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{5, 2, 3, 2, 6, 6, 2, 9, 1, 0, 7, 4, 5, 0}));
    }
}