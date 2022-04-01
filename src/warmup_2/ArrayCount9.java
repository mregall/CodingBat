package warmup_2;

public class ArrayCount9 {
    /*
    return a count of the number of '9' in an array.
     */

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                count++;
            }
        }
        return count;

    }
}
