package warmup_2;

public class ArrayCount9 {
    /*
    return a count of the number of '9' in an array.
     */

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;

    }
}
