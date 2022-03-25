package warmup_1;

public class BackAround {

    public String backAround(String str){
            // Get the last char - substring
            String last = str.substring(str.length() - 1);
            return last + str + last;
        }
}
