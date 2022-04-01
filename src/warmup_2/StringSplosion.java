package warmup_2;

public class StringSplosion {
    public static void main(String[] args) {
        String str = "Code";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += str.substring(0, i+1);

        }
        System.out.println(str2);
    }

    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    Its printing all the letters in for each iteration.  Printing IN the loop
     */

    public static String stringSplosion(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += str.substring(0, i+1);
        }
        return str2;
        }
    }

