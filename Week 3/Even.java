/**
 * Created by Jami on 9/3/2015.
 */
import java.util.*;

public class Even {
    public static void main (String[] arg){
        Scanner console = new Scanner(System.in);

        System.out.println("Give me a number");
        int num = console.nextInt();
        if (num%2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

    }
}
