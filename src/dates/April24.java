package dates;

import java.util.Arrays;

public class April24 {

    public int countEvens(int[] nums) {
        int n = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                n++;
            }
        }
        return n;
    }

    public int bigDiff(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1] - nums[0];
    }

    public int centeredAverage(int[] nums) {
        int denominator = nums.length-2;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        int numerator = -min - max;
        for (int num : nums) {
            numerator += num;
        }
        return numerator/denominator;
    }
}
