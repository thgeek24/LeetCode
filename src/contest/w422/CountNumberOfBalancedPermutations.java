/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w422;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 3343
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/03 11:17
 */
public interface CountNumberOfBalancedPermutations {
    int countBalancedPermutations(String num);

    static List<CountNumberOfBalancedPermutations> getSolutions() {
        return Arrays.asList(new Solution1(), new Solution2());
    }

    class Solution1 implements CountNumberOfBalancedPermutations {
        long[][][] memo;
        int totalSum;
        String num;
        int[] freqArr;
        int M = 1000000007;
        int totalEvenSpace;
        int totalOddSpace;
        int[] prefSum;
        long[] factArr;
        long[] revFactArr;

        public int countBalancedPermutations(String num) {
            freqArr = new int[10];
            this.num = num;

            totalSum = 0;
            for (char ch : num.toCharArray()) {
                freqArr[ch - '0']++;
                totalSum += (ch - '0');
            }

            totalEvenSpace = totalOddSpace = num.length() / 2;

            if ((num.length() % 2) == 1)
                totalEvenSpace++;

            prefSum = new int[11];

            prefSum[0] = 0;

            for (int i = 1; i <= 10; i++) {
                prefSum[i] = freqArr[i - 1] + prefSum[i - 1];
            }

            factArr = new long[num.length() + 1];
            revFactArr = new long[num.length() + 1];
            factArr[0] = 1;
            revFactArr[0] = 1;

            for (int i = 1; i <= num.length(); i++) {
                factArr[i] = (factArr[i - 1] * i) % M;
                revFactArr[i] = fastPower(factArr[i], M - 2);
            }

            memo = new long[10][totalSum + 1][num.length()];

            for (long[][] arr : memo) {
                for (long[] arr1 : arr) {
                    Arrays.fill(arr1, -1);
                }
            }

            return (int) dp(0, 0, 0);
        }

        private long dp(int num, int evenSum, int evenLen) {
            if (num == 10) {
                if (evenSum == (totalSum - evenSum)) {
                    return 1;
                }

                return 0;
            }

            if (memo[num][evenSum][evenLen] == -1) {
                int count = freqArr[num];

                int evenSpaces = totalEvenSpace - evenLen;
                int oddSpaces = totalOddSpace - (prefSum[num] - evenLen);

                long ans = 0;
                // System.out.println(evenSpaces);

                for (int i = 0; i <= Math.min(count, evenSpaces); i++) {
                    if (count - i > oddSpaces)
                        continue;

                    ans = (ans + (((nCr(evenSpaces, i) * nCr(oddSpaces, count - i)) % M)
                            * dp(num + 1, evenSum + (num * i), evenLen + i)) % M) % M;
                }

                memo[num][evenSum][evenLen] = ans;
            }

            return memo[num][evenSum][evenLen];
        }

        private long nCr(int n, int r) {
            return (((factArr[n] * revFactArr[n - r]) % M) * revFactArr[r]) % M;
        }

        private long fastPower(long a, long b) {
            if (b == 0)
                return 1;

            long halfPower = fastPower(a, b / 2);

            if ((b % 2) == 0) {
                return (halfPower * halfPower) % M;
            }

            return (a * ((halfPower * halfPower) % M)) % M;
        }
    }

    // todo time-limit-exceeded
    class Solution2 implements CountNumberOfBalancedPermutations {
        private final static int MOD = 1000000007;

        private final static BigInteger[] memo = new BigInteger[81];

        static {
            memo[0] = new BigInteger("1");
            for (int i = 1; i < memo.length; i++) {
                memo[i] = memo[i - 1].multiply(new BigInteger(String.valueOf(i)));
            }
        }

        @Override
        public int countBalancedPermutations(String num) {
            int[] numCount = new int[10];
            int sum = 0;
            for (char c : num.toCharArray()) {
                int n = c - '0';
                numCount[n]++;
                sum += n;
            }
            if (sum % 2 != 0) {
                return 0;
            }

            int oddSize = num.length() >> 1;
            List<Map<Integer, Integer>> odds = getPermutationsWithCounts(numCount, sum / 2, oddSize);
            long res = 0;
            for (Map<Integer, Integer> odd : odds) {
                Map<Integer, Integer> even = getOtherPermutation(odd, numCount);
                long oddCount = calculateValidPermutations(odd).mod(new BigInteger(String.valueOf(MOD))).longValue();
                long evenCount = calculateValidPermutations(even).mod(new BigInteger(String.valueOf(MOD))).longValue();
                res = (res + oddCount * evenCount) % MOD;
            }
            return (int) res;
        }

        private Map<Integer, Integer> getOtherPermutation(Map<Integer, Integer> permutation, int[] numCount) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < numCount.length; i++) {
                int total = numCount[i];
                int count = permutation.getOrDefault(i, 0);
                int remaining = total - count;
                if (remaining > 0) {
                    map.put(i, remaining);
                }
            }
            return map;
        }

        public List<Map<Integer, Integer>> getPermutationsWithCounts(int[] nums, int target, int fixedSize) {
            List<Map<Integer, Integer>> result = new ArrayList<>();
            backtrack(nums, target, new HashMap<>(), result, 0, 0, 0, fixedSize);
            return result;
        }

        private void backtrack(int[] nums, int target, Map<Integer, Integer> currentMap,
                               List<Map<Integer, Integer>> result, int currentSum, int currentSize, int index, int fixedSize) {
            if (currentSize == fixedSize) {
                if (currentSum == target) {
                    result.add(new HashMap<>(currentMap));
                }
                return;
            }

            if (currentSum > target || index >= nums.length) {
                return; // Prune invalid branches
            }

            for (int i = index; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i]--; // Decrease count
                    currentMap.put(i, currentMap.getOrDefault(i, 0) + 1);// Add to map
                    currentSize++;
                    backtrack(nums, target, currentMap, result, currentSum + i, currentSize, i, fixedSize); // Recurse
                    currentMap.put(i, currentMap.get(i) - 1); // Backtrack
                    currentSize--;
                    if (currentMap.get(i) == 0) {
                        currentMap.remove(i); // Clean up map
                    }
                    nums[i]++; // Restore count
                }
            }
        }

        public BigInteger calculateValidPermutations(Map<Integer, Integer> digitCounts) {
            int totalDigits = digitCounts.values().stream().mapToInt(Integer::intValue).sum();
            BigInteger totalPermutations = factorial(totalDigits);

            // Divide by factorial of each count
            for (int count : digitCounts.values()) {
                totalPermutations = totalPermutations.divide(factorial(count));
            }

            return totalPermutations;
        }

        private BigInteger factorial(int totalDigits) {
            return memo[totalDigits];
        }
    }
}
