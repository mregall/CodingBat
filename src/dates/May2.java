package dates;

public class May2 {

    //one
    public static boolean makeBricks(int small, int big, int goal) {

        return goal % 5 <= small && big * 5 + small >= goal;
    }

    /*
        if (goal / 5 <= big) return (goal % 5 <= small);
        else return (small >= (goal - big * 5));
    */

    /*
        return (goal > (big*5) + small) ? false : (goal % 5 <= small) ? true : false;
     */

    //two
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (b == c) return a;
        if (a == c) return b;
        return a + b + c;
    }

    //three
    public int luckySum(int a, int b, int c) {
        int[] arr = {a, b, c};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13){
               break;
            }
            else count += i;
        }
        return count;
    }
}