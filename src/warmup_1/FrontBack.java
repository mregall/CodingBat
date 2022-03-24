package warmup_1;

public class FrontBack {

    public String frontBack(String str) {
        return getString(str);
    }

    static String getString(String str) {
        if (str.length()>1){
            String frontBack = "";
            frontBack += str.charAt(str.length()-1);
            for (int i = 1; i < str.length()-1; i++) {
                frontBack += str.charAt(i);
            }
            frontBack += str.charAt(0);
            return frontBack;
        }
        return str;
    }

    public String frontBackOfficial(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);//pulled the middle then concat.

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

}
