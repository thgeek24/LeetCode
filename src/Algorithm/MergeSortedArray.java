package Algorithm;

public class MergeSortedArray {
    private void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        if (m > 0) m--;
        if (n > 0) {
            n--;
        } else {
            return;
        }
        while (n >= 0) {
            if (m != -1) {
                if (nums1[m] > nums2[n]) {
                    nums1[k--] = nums1[m--];
                } else {
                    nums1[k--] = nums2[n--];
                }
            } else {
                while (n != -1) {
                    nums1[n] = nums2[n];
                    n--;
                }
                return;
            }

        }
    }

    public static void main(String[] args) {
        MergeSortedArray ms = new MergeSortedArray();
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        int m = 1, n = 1;
        ms.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
