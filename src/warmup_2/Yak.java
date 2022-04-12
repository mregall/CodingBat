package warmup_2;

public class Yak {

    public String stringYak(String str) {
        String yak = "yak";
        String noYak = "";

    for (int i=0; i<str.length(); i++) {
        if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            i =  i + 2;
        } else {
            noYak += str.charAt(i);
        }
    }
    return noYak;
}


}
