package warmup_1;

public class Warmup_Util {  


    public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (!aSmile || bSmile) && (aSmile || !bSmile);
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



}


