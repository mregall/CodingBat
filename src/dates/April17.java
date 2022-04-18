package dates;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class April17 {

    //one
    public String atFirst(String str) {
        if (str.length()>=2){
            return str.substring(0,2);
        }else if (str.length()==1){
            return str + "@";
        }
        return "@@";
    }

    //two
    public String lastChars(String a, String b) {
        if (a.length()==0)
            a = "@";
        if (b.length()==0)
            b = "@";
        return a.charAt(0) + b.substring(b.length()-1);
    }

    //three
    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a+b;
        if (a.charAt(a.length()-1) == b.charAt(0)){
            return a + b.substring(1);
        }
        return a+b;
    }

    //four
    public String lastTwo(String str) {
        if (str.length()>=2){
            String last = str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
            return str.substring(0,str.length()-2)+last;
        }
        return str;
    }

    //five
    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    //six
    public boolean frontAgain(String str) {
        if (str.length()<2) return false;
        String ending = str.substring(str.length()-2);
        return str.substring(0, 2).equals(ending);
    }

    //seven
    public String minCat(String a, String b) {
        if (a.length()==b.length()) return a+b;
        if (a.length()>b.length()){
            int a2 = a.length()-b.length();
            return a.substring(a2,a.length())+b;
        }
        else {
            int b2 = b.length()-a.length();
            return a+b.substring(b2, b.length());
        }
    }

    //eight
    public String extraFront(String str) {
        if (str.length()==1) return str+str+str;
        if (str.length()>1) {
            String st = str.substring(0,2);
            return st+st+st;
        }
        return "";
    }

    //nine
    public int[] midThree(int[] nums) {
        int n = nums.length/2;
        int[] arr = new int[3];
        arr[0] = nums[n-1];
        arr[1] = nums[n];
        arr[2] = nums[n+1];
        return arr;
    }

    //ten
    public int maxTriple(int[] nums) {
        int max = 0;
        int n = nums.length/2;
        int f = nums[0];
        int m = nums[n];
        int e = nums[nums.length-1];
        if (f > m) {
            max = f;
        }else{
            max = m;
        }
        if (e > max){
            max = e;
        }
        return max;
        //this feels awful, but it worked.
    }

    //ten v2 - we hadn't learned the Math functions so that makes sense.
    public int maxTriples(int[] nums) {
        return Math.max(nums[0], Math.max(nums[(nums.length - 1) / 2], nums[nums.length - 1]));
    }

    //eleven
    public int[] frontPiece(int[] nums) {
        if (nums.length>=2){
            int[] n = {nums[0], nums[1]};
            return n;
        }
        return nums;
    }

    //twelve
    public boolean unlucky1(int[] nums) {
        if (nums.length<2) return false;
        if ((nums[0] == 1) && (nums[1] == 3)) return true;
        if ((nums[1] == 1) && (nums[2] == 3)) return true;
        return ((nums[nums.length-2]==1) && (nums[nums.length-1]==3));
    }

    //thirteen
    public int[] make2(int[] a, int[] b) {
        int[] two = new int[2];
        if (a.length>=2){
            two[0]=a[0];
            two[1]=a[1];
            return two;
        }
        if (a.length==1){
            two[0]=a[0];
            two[1]=b[0];
            return two;
        }else{
            two[0]=b[0];
            two[1]=b[1];
            return two;
        }
    }

    //fourteen
    public int[] front11(int[] a, int[] b) {
        //set it to zero length, then change the length? How does this work?
        //is it because it hasn't been used yet?
        int[] c =new int[0];

        if(a.length>0 && b.length>0){
            c = new int[2];
            c[0]=a[0];
            c[1]=b[0];
        }else if(a.length == 0 && b.length>1){
            c = new int[1];
            c[0]=b[0];
        }else if(b.length == 0 && a.length>1){
            c = new int[1];
            c[0]=a[0];
        }
        return c;

    }
}
































































