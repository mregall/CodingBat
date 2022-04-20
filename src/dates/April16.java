package dates;

import java.util.Arrays;

public class April16 {

    //one
    public String twoChar(String str, int index) {
            if (str.length() <= index + 1 || index < 0)
                return str.substring(0,2);
            else
                return str.substring(index, index + 2);
        }

    //two
    public String middleThree(String str) {
        return str.substring((str.length()/2)-1, (str.length()/2)+2);
    }

    //three
   public int[] biggerTwo(int[] a, int[] b) {
        if ((a[0]+a[1])>=(b[0]+b[1])){
            return a;
        }
            return b;
    }

    //four
    public int[] makeMiddle(int[] nums) {
        int[] mm = new int[2];
        int mid = nums.length/2;
        mm[0] = nums[mid-1];
        mm[1] = nums[mid];
        return mm;
    }

    //five
    public int[] plusTwo(int[] a, int[] b) {
        int[] c = new int[4];
        c[0] = a[0];
        c[1] = a[1];
        c[2] = b[0];
        c[3] = b[1];
        return c;
        //could add like int[] c = {a[0], a[1]...};
    }

    //six
    public int[] swapEnds(int[] nums) {
        int f = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = f;
        return nums;
    }

    //seven
    public boolean hasBad(String str) {
        if(str.length()<3) {
            return false;}
        return str.startsWith("bad") || str.substring(1).startsWith("bad");
    }



    public static void main(String[] args) {

    }
}
