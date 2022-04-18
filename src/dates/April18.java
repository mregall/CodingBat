package dates;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class April18 {

    //one
    public String without2(String str) {
        if (str.length()<2) return str;
        String end = str.substring(str.length()-2);
        if (str.substring(0,2).equals(end)) return str.substring(2);
        return str;
    }

    //two
    //Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    public String deFront(String str) {
        String output = "";
        if (str.startsWith("a")){
            output+="a";
        }if (str.substring(1).startsWith("b")){
            output+="b";
        }
        return output+str.substring(2);
    }

    //three
    public String startWord(String str, String word) {
        /*int n = word.length();
        char c = word.charAt(0);
        if (str.substring(1,n).equals(word.substring(1))){
            if (word.length()>1) return c+str.substring(1,n);
        }
        return word.substring(0,1);*/
        if(str.length()>=word.length() && str.substring(1,word.length()).equals(word.substring(1,word.length())))
            return str.substring(0,word.length());
        else return "";
    }

    //four
    public String withoutX(String str) {
        if (str.startsWith("x"))
            str = str.substring(1);
        if (str.endsWith("x"))
            str = str.substring(0,str.length()-1);
        return str;
    }

    //five
    public String withoutX2(String str) {
        if (str.length()==0)return "";
        String zero = str.substring(0,1);
        if (zero.contains("x"))
            zero = "";
        if (str.length()==1)return zero;
        String one = str.substring(1,2);
        if (one.contains("x"))
            one = "";
        return zero+one+str.substring(2);
    }
    //String 1 and Array 1 are done!!

    //six
        /*
        You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
         */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday && speed>5) speed -=5;
        if (speed <=60) return 0;
        if (speed >= 61 && speed <= 80) return 1;
        else return 2;
    }

    //seven
    public int sortaSum(int a, int b) {
        int sum = a+b;
        if (sum >= 10 && sum <= 19)return 20;
        return sum;
    }

    //eight
    public String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day == 0 || day == 6) return "10:00";
            else return "7:00";
        } else if (day == 0 || day == 6) return "off";
        else return "10:00";
    }

    //nine
    public boolean love6(int a, int b) {
        return (a+b ==6 || a == 6 || b == 6 || Math.abs(a-b)==6);
    }

    //ten
    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode){
            return (n>=1 && n<=10);
        }else{
            return n<=1 || n>=10;
        }
    }

    //eleven

}



























































