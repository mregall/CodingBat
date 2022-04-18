package dates;

import java.nio.charset.StandardCharsets;

public class April17 {

    //one
    public String atFirst(String str) {
        if (str.length()>=2){
            return str.substring(0,2);
        }else if (str.length()==1){
            return str + "@";
        }
        return "@@";
    }

    //two
    public String lastChars(String a, String b) {
        if (a.length()==0)
            a = "@";
        if (b.length()==0)
            b = "@";
        return a.charAt(0) + b.substring(b.length()-1);
    }

    //three
    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a+b;
        if (a.charAt(a.length()-1) == b.charAt(0)){
            return a + b.substring(1);
        }
        return a+b;
    }

    //four
    public String lastTwo(String str) {
        if (str.length()>=2){
            String last = str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
            return str.substring(0,str.length()-2)+last;
        }
        return str;
    }

    //five
    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    //six
    public boolean frontAgain(String str) {
        if (str.length()<2) return false;
        String ending = str.substring(str.length()-2);
        return str.substring(0, 2).equals(ending);
    }

    //seven
    public String minCat(String a, String b) {
        if (a.length()==b.length()) return a+b;
        if (a.length()>b.length()){
            int a2 = a.length()-b.length();
            return a.substring(a2,a.length())+b;
        }
        else {
            int b2 = b.length()-a.length();
            return a+b.substring(b2, b.length());
        }
    }

    //eight
    public String extraFront(String str) {
        if (str.length()==1) return str+str+str;
        if (str.length()>1) {
            String st = str.substring(0,2);
            return st+st+st;
        }
        return "";
    }


}
































































