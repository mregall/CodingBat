package warmup_2;

public class AltPairs {
    /*
     Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

     I don't understand this one

     */
    public static String altPairs(String str) {
        return str.substring(0,2) + str.substring(4,6) + str.substring(8, 10);

    }

    public static String pairs(String str){
    String result = "";

    for (int i=0; i<str.length(); i += 4) {
        //End is letting us know when to stop.
        //Kind of like an internal iteration
        int end = i + 2;
        if (end > str.length()) {
            end = str.length();
        }
        result = result + str.substring(i, end);
    }

  return result;
}
}
