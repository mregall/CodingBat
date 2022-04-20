package warmup_1;

public class Warmup_Util {




    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (!aSmile || bSmile) && (aSmile || !bSmile);
        }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int sumDouble(int a, int b) {
        if(a != b){
            return a+b;
        }
        return (a+b)*2;
    }

    public int diff21(int n) {
        if(n <= 21){
            return 21-n;
        }
        return (n-21)*2;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && hour < 7) || (talking && hour > 20);
    }

    public boolean makes10(int a, int b) {
        if(a+b==10){
            return true;
        }else return a == 10 || b == 10;
    }
    public boolean nearHundred(int n) {
        if (n>=90 && n<=110){
            return true;
        }else return n >= 190 && n <= 210;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a<0 && b<0);
        }else{
            return((a<0 && b>0)||(a>0 && b<0));
        }}

    public String notString(String str) {
        if(str.length() >= 3 && str.startsWith("not")){
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (i==n){
                continue;
            }
            str2 += str.charAt(i);
        } return str2;
    }

    public String front3(String str) {
       if (str.length() >3){
           str = str.substring(0,3);
       }
       return str + str + str;
    }

    public String backAround(String str){
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }
















































}


