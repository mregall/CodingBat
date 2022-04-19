package dates;

public class April19 {

    //one
    public boolean nearTen(int num) {
        return num % 10 <= 2 || 10 - num % 10 <= 2;
    }

    //two
    public int teenSum(int a, int b) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19)) return 19;
        return a+b;
    }

    //three
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        return !isMorning || isMom;
    }

    //four
    public int teaParty(int tea, int candy) {
        if (tea<5 && candy<5)return 0;
        if (tea > (candy*2) || candy > (tea*2)) return 2;
        return 1;
    }

    //five
    public String fizzString(String str) {
        String fizzBuzz = "";
        if (str.startsWith("f")){
            fizzBuzz += "Fizz";
        }
        if (str.endsWith("b")) {
            fizzBuzz+= "Buzz";
        }
        if (fizzBuzz.length()<1){
            return str;
        }else
            return fizzBuzz;

        /*
          boolean f = str.startsWith("f");
          boolean b = str.endsWith("b");

          if (f && b) return "FizzBuzz";
          if (f) return "Fizz";
          if (b) return "Buzz";
          return str;
         */
    }

    //six
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    //seven
    public boolean twoAsOne(int a, int b, int c) {
        return a+b==c || a+c==b || b+c==a;
    }

    //eight
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) return (b<c);
        return (a<b && b<c);
    }

    //nine
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
       if ((equalOk) && (a<=b && b<=c)) {
           return true;
       }
       return (a<b && b<c);
    }

    //ten
    public boolean lastDigit(int a, int b, int c) {
        return true;
    }

}

























































