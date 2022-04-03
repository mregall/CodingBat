package warmup_2;

public class AltPairs {
    /*
     Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

     I don't understand this one

     */
    public static String altPairs(String str) {
        if (str.length()< 10){

        }
        return str.substring(0,2) + str.substring(4,6) + str.substring(8, 10);

    }
}
