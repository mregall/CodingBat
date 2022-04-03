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
}
