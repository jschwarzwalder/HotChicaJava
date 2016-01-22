import java.io.Console;
import java.util.Scanner;

/**
 * Created by Jami on 8/31/2015.
 */
public class min {
    public static void main (String[] args){
        twentyFour();
    }

    public static int min (int x, int y, int z){
            int xy_min = Math.min(x,y);
            return Math.min(xy_min, z);
        }
   public static void twentyFour() {
        System.out.println("Enter a whole number please");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        System.out.println(num * 2);
        }
}