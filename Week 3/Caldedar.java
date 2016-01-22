import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Jami on 8/31/2015.
 */
public class Calendar {
    public static String[] WEEKDAY = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static void main(String[] args){
        month(2, 31);
        System.out.println();
        month(4, 31);
        System.out.println();
        month(4, 28);
        System.out.println();
        month(1, 28);
    }
    //Returns a string of the number n, left-padded
    //with spaced until it is at least the given width.
    public static String padded (int n, int width){
        String s = "" + n;
        for (int i = s.length(); i < width; i++){
            s = " " + s;
        }
        return s;
    }


    public static void month (int firstSunday, int lastDay){
        //Labels for days of week

        for (int i =0; i < 7; i++ ){
            System.out.print("   " + WEEKDAY[i] + " ");
        }
        System.out.println();
        for (int i =1; i <= 7; i++ ){
            System.out.print("+------");
        }
        System.out.println("+");


        //First week
        if (firstSunday != 1){
            for (int i = 1; i <= 8-firstSunday; i++){
                System.out.print("|      ");
            }
            for (int i= 1; i < firstSunday ; i++){
                System.out.print("|" + padded(i, 4)+ "  ");
            }
            System.out.println("|");
        }

        //Second Week
        for (int i = firstSunday; i <= firstSunday+6; i++){
            System.out.print("|" + padded(i, 4)+ "  ");
        }
        System.out.println("|");

        //Third Week
        for (int i = firstSunday+7; i <= firstSunday+6+7; i++){
            System.out.print("|" + padded(i, 4)+ "  ");
        }
        System.out.println("|");

        //Fourth Week
        for (int i = firstSunday+14; i <= firstSunday+6+14; i++){
            System.out.print("|" + padded(i, 4)+ "  ");
        }
        System.out.println("|");

        //Fifth Week
        if (firstSunday+28 < lastDay){
            for (int i = firstSunday+21; i <= firstSunday+6+21; i++){
                System.out.print("|" + padded(i, 4)+ "  ");
            }
            System.out.println("|");
        }
        else {
            //if last day is before the end of the week
            for (int i = firstSunday+21; i <= lastDay; i++){
                System.out.print("|" + padded(i, 4)+ "  ");
            }
            for (int i = lastDay; i<= firstSunday+26;i++ ){
                System.out.print("|      ");
            }
            System.out.println("|");
        }

        //Sixth Week
        if (firstSunday+28 < lastDay && firstSunday+35 > lastDay){
            //if last day is before the end of the week
            for (int i = firstSunday+28; i <= lastDay; i++){
                System.out.print("|" + padded(i, 4)+ "  ");
            }
            for (int i = lastDay; i< firstSunday+34;i++ ){
                System.out.print("|      ");
            }
            System.out.println("|");
        }

        //Closing the Calendar
        for (int i =1; i <= 7; i++ ){
            System.out.print("+------");
        }
        System.out.println("+");
    }
}
