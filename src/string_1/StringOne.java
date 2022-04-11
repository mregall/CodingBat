package string_1;

public class StringOne {
    public static void main(String[] args) {

    }

        public static String comboString(String a, String b) {

        if (a.length() < b.length()){
            return a + b + a;
        }else{
            return b + a + b;
        }
    }

    public static String right2(String str) {
        int length = str.length();
        String end = "";
        if (str.length() > 2) {
            for (int i = str.length() - 2; i < str.length(); i++) {
                end += str.charAt(i);
            }
            return end + str.substring(0, str.length()-2);

        }
        return str;
    }

    public String theEnd(String str, boolean front) {
        /*
        Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
         */
        String end = str.substring(str.length()-1);
        if (front) return str.substring(0,1);
        return end;
    }
    public String withouEnd2(String str) {
        if (str.length()<2) return "";
        return str.substring(1, str.length()-1);
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length>=1){
            if (nums[0] == nums[nums.length-1]) return true;
        }
        return false;
    }
}

