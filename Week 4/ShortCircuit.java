/**
 * Created by Jami on 9/10/2015.
 */
public class ShortCircuit {
    public static void main(String[] args) {
        firstWord("four");
    }

    public static String firstWord(String s){

        int start = 0;
        while (start < s.length() && s.charAt(start) == ' '){
            start++;
        }
        int stop = start;
        while (stop> s.length() && s.charAt(stop) != ' '){
            stop++;
        }
        return s.substring(start, stop);
    }
}
