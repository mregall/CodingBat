package warmup_2;

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("axxxversx"));
                stringX("axxxversx");
    }
    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
     */

    public static String stringX(String str) {
        //todo: figure out why mine didn't work.
       /* String mid = str.substring(1,str.length()-1);
        String result = "";
        for (int i = 0; i < mid.length(); i++) {
            if (mid.charAt(i)=='x'){
                continue;
            }else{
                result += str.charAt(i);
            }
        }
        return str.substring(0,1) + result + str.substring(str.length()-2);*/

        String result = "";
        for (int i=0; i<str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')) {
                result = result + str.charAt(i); // Could use str.charAt(i) here
            }
        }
        return result;

    }



}
