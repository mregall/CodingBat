package array_1;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(rotateLeft3(nums)));

    }
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length>=1){
            return nums[0] == nums[nums.length - 1];
        }
        return false;
        //return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
        //both things need to be true, so it can be 'and' statement
    }

    public int sum3(int[] nums) {
        int n = 0;
        for (int each : nums){
            n += each;
        }
        return n;
    }
    public static int[] rotateLeft3(int[] nums) {
        int[] result = {nums[2],nums[1],nums[0]};
        return result;

    }

    public static int[] reverse(int[] nums){
        int[] result = new int[3];
        for (int i = 2, j = 0; i >= 0 ; i--, j++) {
            result[j] = nums[i];
        }
        return result;
    }

    public static int[] maxEnd3(int[] nums) {
        int bigger = Math.max(nums[0], nums[2]);
        nums[0]=bigger;
        nums[1]=bigger;
        nums[2]=bigger;
        return nums;
    }

    public static int sum2(int[] nums) {
        if (nums.length<1) return 0;
        else if (nums.length ==1) return nums[0];
        else return nums[0] + nums[1];
    }

    public static int[] makeEnds(int[] nums) {
       int[] deuce = new int[2];
        deuce[0] = nums[0];
        deuce[1] = nums[nums.length-1];
        return deuce;

    }
    public static boolean has23(int[] nums) {
        for (int each: nums){
            if (each == 2 || each ==3){
                return true;
            }
        }
        return false;

    }

    public int[] makeLast(int[] nums) {
        //we aren't changing nums, so the variable doesn't need to be there.
        //can just copy from nums after creating the new array.
        int last = nums[nums.length-1];
        int[] twice = new int[nums.length*2];
        twice[twice.length-1] = last;
        return twice;
    }

    public boolean double23(int[] nums) {
        int c2 = 0;
        int c3 = 0;
        for (int each : nums)
            if (each == 2){
                c2++;
            }else if(each ==3){
                c3++;
            }
        return c2 == 2 || c3 == 2;

    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2 && nums[i+1]==3){
                nums[i+1] = 0;
            }
        }
        return nums;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        return a;

    }



}









































