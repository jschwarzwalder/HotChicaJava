/**
 * Created by Jami on 9/24/2015.
 */
public class Odd {
    public static void main(String[] args){
        int first = -6;
        int last = 38;
        int[] oddNum = new int[(last - first) / 2];

        int num = first;
        if (num % 2 == 0){
            num++;
        }

        for (int i = 0; i < oddNum.length ; i ++){
            oddNum[i] = num;
            System.out.println(num);
            num += 2;
        }


        System.out.println(oddNum);
    }
}
