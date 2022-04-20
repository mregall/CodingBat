package dates;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class April20 {

    //one
    public static boolean lastDigit(int a, int b, int c) {
        int a2 = a % 10;
        int b2 = b % 10;
        int c2 = c % 10;
        return (a2 == b2 || b2 == c2 || a2 == c2);
    }

   //two
    public boolean lessBy10(int a, int b, int c) {
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        int dif = max - min;
        return dif >= 10;

        //return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
    }

        /*
        Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
         */
    //three
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1==6 && die2==6){
            die1 = 1;
            return die1+die2;
        }
        if (noDoubles && die1==die2) return die1+die2+1;
        return die1+die2;
    }

    //four
    public int maxMod5(int a, int b) {
        if (a==b)return 0;
        int a2 = a % 5;
        int b2 = b % 5;
        if (a2 == b2) return Math.min(a, b);
        return Math.max(a, b);
    }

    //five
    public int redTicket(int a, int b, int c) {
        if (a+b+c==6)return 10;
        if (a==b && b==c) return 5;
        if (c!=a && b!=a) return 1;
        return 0;
    }

    //six
    public int greenTicket(int a, int b, int c) {
        if (a!=b && a!=c && b!=c) return 0;
        if (a==b && b==c) return 20;
        if (a==b || a==c || c==b) return 10;
        return 0;
    }

    //seven
    public int blueTicket(int a, int b, int c) {
        int ab = a+b;
        int ac = a+c;
        int bc = b+c;
        if (ab==10 || ac==10 || bc==10) return 10;
        if (ab==ac+10 || ab==bc+10) return 5;
        return 0;
    }

    //eight
    public boolean shareDigit(int a, int b) {
        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;
        return(a1 == b1 || a2 == b1 || a1 == b2 || a2 == b2);
    }

    //nine
    public static int sumLimit(int a, int b) {
        int c = a+b;
        String SC = String.valueOf(c);
        int lenC = SC.length();
        String SA = String.valueOf(a);
        int lenA = SA.length();
        if (lenC>lenA)return a;
        return c;
    }

    //ten
    public String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output += "" + str.charAt(i)+str.charAt(i);
        }
        return output;
    }

    //eleven
    public int countHi(String str) {
        int n = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                n ++;
            }
        }
        return n;
    }

    //twelve
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0, j = 0; i < str.length() - 2; i++, j++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                cat++;
            }
            if (str.charAt(j) == 'd' && str.charAt(j + 1) == 'o' && str.charAt(j + 2) == 'g') {
                dog++;
            }
        }
        return cat == dog;
    }

    //thirteen
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
            }
        return count;
    }

    //fourteen
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        int lenA = a.length();
        b = b.toLowerCase();
        int lenB = b.length();
        return a.endsWith(b) || b.endsWith(a);
    }

            /*
            Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
             */
    //fifteen
    //there are a lot of solutions but this is my favorite.
    public boolean xyzThere(String str) {
        if (str.startsWith("xyz"))return true;
        for(int i = 1; i < str.length()-2;i++){
            if(str.startsWith("xyz", i) && str.charAt(i-1) != '.')
                return true;
        }
        return false;
    }

    //sixteen
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
           if (str.charAt(i)=='b' && str.charAt(i+2)=='b'){
               return true;
           }
        }
        return false;
    }

    //seventeen
    public boolean xyBalance(String str) {
            /*if (str.contains("x") && !str.contains("y")) return false;
            if (str.contains("y") && !str.contains("x")) return true;
            if (str.contains("y")){
                int n = str.lastIndexOf("y");
                for (int i = n; i < str.length(); i++) {
                    if (str.charAt(i) == 'x'){
                        return false;
                    }
                }
            }
            return false;*/
        return (str.indexOf('x')==-1) || str.lastIndexOf('x') < str.lastIndexOf('y');
        //if there's no x then true, if there's a y after the last x then true, else false
        //damn!
    }

    //eighteen
    public String mixString(String a, String b) {
        return "";
    }











    public static void main(String[] args) {
        sumLimit(7,12);
    }























}























