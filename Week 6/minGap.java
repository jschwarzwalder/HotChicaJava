/**
 * Created by Jami on 9/27/2015.
 */
public class minGap {
    // accepts int array
    public static void main (String[] args){
        System.out.println(minGap(new int[]{1, 2, 3, 4, 3}));
        System.out.println("zero");
        System.out.println(minGap(new int[]{}));
        System.out.println("one");
        System.out.println(minGap(new int[]{1}));
        System.out.println("two");
        System.out.println(minGap(new int[]{1, 2,}));
        System.out.println(minGap(new int[]{10, 2, 3, 4, 3}));
    }
    public static int minGap(int[] arr){
        //returns the minimum differene or gape between adjacent values in array


        // if fewer than two elements return 0
        int gap = 0;
        if (arr.length >= 2) {
            gap = arr[1]-arr[0];
            for (int i = 1; i < arr.length; i++) {
                int difference = arr[i] - arr[i-1];
                //System.out.println(arr[i]+ " - " + arr[i-1]+ " = "+ difference);
                if (difference < gap) {
                    //if the list is not sorted the gap could be a negative number
                    gap = difference;
                }
            }
        }

        return gap;
    }

}
