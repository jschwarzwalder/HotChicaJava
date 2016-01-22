/**
 * Created by Jami on 9/25/2015.
 */
public class AllLess {

    public static void main(String[] args) {
        int[] one = {0, 1, 2, 3, 4, 5};
        int[] two = {1, 2, 3, 4, 5, 6};


        System.out.println(allLess(one, two));

        one[0] = 12;

        System.out.println(allLess(one, two));

        two = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println(allLess(one, two));

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80 , 90, 100};

        for (int i = 1; i < 10; i++){
            numbers[i] = numbers[i - 1];
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();
        numbers = new int[] {10, 20, 30, 40, 50, 60, 70, 80 , 90, 100};

        for (int i = 0; i < 9; i++){
            numbers[i] = numbers[i + 1];
            System.out.print(numbers[i] + ", ");
        }


    }

    private static boolean allLess(int[] one, int[] two) {
        if (one.length != two.length){
            return false;
        }
        for (int i = 0; i < one.length; i++){
            if (one[i] >= two[i])
            {
                return false;
            }
        }

        return true;
    }

}
