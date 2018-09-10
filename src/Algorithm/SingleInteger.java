package Algorithm;

/**
 * @author taohong on 09/09/2018
 */
public class SingleInteger {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            int sn = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (sn == nums[j]) {
                    if (i == j + 1) {
                        i++;
                        break;
                    }
                    int tmp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = tmp;
                    i++;
                    break;
                }
                if (j == nums.length - 1)
                    return sn;
            }

        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        SingleInteger si = new SingleInteger();
        int[] arr = {1, 0, 1};
        System.out.println(si.singleNumber(arr));
    }
}
