package medium;

import java.util.Arrays;

public class P1685 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        int[] result = new P1685().getSumAbsoluteDifferences(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        int[] res = new int[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        suffixSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            res[i] = nums[i] * i - prefixSum[i] + suffixSum[i] - nums[i] * (n - i - 1);
        }

        return res;
    }
}
