//7 18 19 21 27
import java.util.Scanner;

/**
 * Created by Jami on 9/3/2015.
 */
public class Middle_number {

        public static void main (String[] arg){
            System.out.println(medianOf3(1, 2, 3));
            System.out.println(medianOf3(3, 2, 1));
            System.out.println(medianOf3(1, 7, 3));
            System.out.println(medianOf3(1, -2, 3));

    }
    public static int medianOf3 (int n1, int n2, int n3 ){
       int maxOfn1n2 = Math.max(n1, n2);
        int minOfn1n2 = Math.min(n1,n2);
        if (maxOfn1n2 <= n3){
            return maxOfn1n2;
        }
        else if (minOfn1n2 <= n3){
            return n3;
        }
        else if (minOfn1n2 >= n3){
            return minOfn1n2;
        }
        return  0;
    }

}
