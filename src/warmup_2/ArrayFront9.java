package warmup_2;

import java.util.Arrays;

public class ArrayFront9 {
    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 Coding bat solution used a variable as the length to write less code.

     int end = nums.length;
        if (end > 4) end = 4;

    for (int i=0; i<end; i++) {
        if (nums[i] == 9) return true;
        }
        return false;

         */

    public static boolean arrayFront9(int[] nums) {
        if (nums.length >= 4) {
            int[] four = Arrays.copyOf(nums, 4);
            for (int each : four){
                if (each == 9) return true;
            }
        }else{
            for (int each : nums){
                if (each == 9) return true;
            }
        }
        return false;

    }


}
