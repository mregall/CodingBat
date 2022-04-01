package warmup_2;

public class StringBits {

    public static String stringBits(String str){

        String output = "";

        for (int i = 0; i < str.length(); i=i+2) {
            output += str.charAt(i);
        }
        return output;
    }
}
