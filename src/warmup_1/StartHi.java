package warmup_1;

public class StartHi {
    public boolean startHi(String str) {
        if(str.length() >= 2){
            return str.startsWith("hi");
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1<0 && temp2>100)||(temp1>100 && temp2<0);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a<=20)||(b>=10 && b<=20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19);
    }

    public String delDel(String str) {
        if(str.length()>=4 && str.substring(1,4).equalsIgnoreCase("del")){
            return str.charAt(0)+str.substring(4);
        }
        return str;
    }

    public boolean loneTeen(int a, int b) {
        if ((a>=13 && a<=19) && (b>=13 && b<=19)){
            return false;
        }else{
            return (a>=13 && a<=19)||(b>=13 && b<=19);
        }
        /*
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
         */
    }

    public boolean mixStart(String str) {
        return str.substring(1,3).equalsIgnoreCase("ix");

    }

    public String startOz(String str) {
        if (str.length()>=1 && str.charAt(0)=='o'){
            return "o";
        }
        if ((str.length()>1) && (str.charAt(1)=='z')) {
            return "z";
        }
        return "";
    }

    public int intMax(int a, int b, int c) {
        int big = 0;
        if(a>b){
            big = a;
        }else{
            big = b;
        }if(big > c) {
            return big;
        }else{
            return c;
        }
    }

    public int close10(int a, int b) {
        int distA, distB;
        distA = 10-a;
        distB = 10-b;
        if (distA != distB){
            if (distA < distB){
                return a;
            }else{
                return b;
            }
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||  ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20){
            a = a;
        }else{
            a = 0;
        }
        if (b >= 10 && b <= 20){
            b = b;
        }else{
            b = 0;
        }
        if (a > b){
            return a;
        }
        return b;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                count ++;
            }
            return count >=1 && count <= 3;
        }
        return false;

    }

    public boolean lastDigit(int a, int b) {
        a = a % 10;
        b = b % 10;
        return a == b;
    }

    public String endUp(String str) {
        if (str.length() <3) return str.toUpperCase();
        int lastThree = str.length()-3;
        String begin = str.substring(0, lastThree);
        String end = str.substring(lastThree);
        return begin + end.toUpperCase();
    }

    public String everyNth(String str, int n) {

        String nth = "";
        for (int i = 0; i < str.length(); i=i+n) {
            nth += str.charAt(i);
            }
        return str.charAt(0)+nth;
    }

    public String stringTimes(String str, int n) {
        String str2 = "";

        for (int i = 0; i < n; i++) {
            str2 += str2+str;
        }
        return str2;

        }

    }

























































