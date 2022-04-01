package warmup_2;

public class DoubleX {

    /*
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     */

    public static boolean doubleX(String str){
        /* for (int i = 0; i < str.length()-1; i++) {
            if ((str.charAt(i)=='x') && (str.charAt(i+1)=='x')){
                return true;
            }
        }
        return false;

        My method doesn't find the first instance of 'x'
        The question asks for first index, we don't need to use a loop since we know where to start. */

        //todo: learn to use elimination


        int i = str.indexOf("x"); // find the first index and start from there.
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.charAt(i + 1) == 'x';

        //this method eliminates false answers first.
    }

}
