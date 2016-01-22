import java.awt.*;

/**
 * Created by Jami on 9/27/2015.
 */
public class collapse {
    public static void main (String[] args){
        System.out.println("test 1");
        printArray(collapse(new int[]{1, 2, 3, 4, 5}));
        System.out.println("test 2");
       printArray(collapse(new int[]{7, 2, 8, 9, 4, 13, 7, 1, 9, 10}));
        System.out.println("test 3");
        printArray(collapse(new int[]{1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5}));
        System.out.println("test 4");
        printArray(collapse(new int[]{1,2}));
        System.out.println("test 5");
        printArray(collapse(new int[]{}));
    }
    public static int[] collapse(int[] input){
        int[] output;
        if (input.length%2 == 0){
            output = new int[(input.length/2)];
        } else {
            output = new int[(input.length/2 +1)];
            output[output.length-1]= input[input.length-1];
        }
        for (int i = 0; i < input.length-1; i+=2){
            output[i/2] = combine(input[i], input[i+1]);
        }
        return output;
    }

    public static int combine(int a, int b){
        return a + b;
    }
    public static void printArray(int[] array) {
        System.out.print("Array:");
        if (array.length > 0) {
            System.out.print( " [" +array[0]);

            if(array.length> 1) {
                for (int i = 1; i < array.length; i++) {
                    System.out.print(", " + array[i]);
                }
            }
            System.out.print("]");

        }
        else{
            System.out.print("There is no array");
            System.out.println("(or you could say its empty if you want to be boring)");
        }
        System.out.println();
    }
}
