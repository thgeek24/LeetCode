package Algorithm;

public class ClimbingStairs {
//    private int climbStairs(int n) {
//        int sum = 0;
//        for (int i = 0; i <= n / 2; i++) {
//            if (i == 0) {
//                sum++;
//            } else {
//                int tmp = n - i;
//                int m = 1;
//                int count = 0;
//                while (count < i) {
//                    m *= tmp--;
//                    count++;
//                }
//                sum += m / factorial(i);
//            }
//        }
//        return sum;
//    }

//    private int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else
//            return n * factorial(n - 1);
//    }

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }

    private int climb_Stairs(int i, int n, int[] memo) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        if (memo[i] > 0)
            return memo[i];
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(44));

//        System.out.println(cs.factorial(4));
    }


}
