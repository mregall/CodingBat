package warmup_2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String str2 = "";

        for (int i = 0; i < n; i++) {
            str2 += str2+str;
        }
        return str2;

    }

    public static void main(String[] args) {
    }
}
