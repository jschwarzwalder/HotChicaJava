/**
 * Created by Jami on 8/30/2015.
 */
public class Routing2 {
    public static final int MAX_NUM = 8; // Numbers that will be repeated from 1 to MAX_NUM
    public static final int MAX_TOTAL = 56; // Maximum total of numbers in the print out

    public static void main(String[] args){
        for (int k = 1; k <= 2; k++){
            for (int i = 1; i <= (MAX_TOTAL/MAX_NUM); i++){
                for (int j = 1; j <= MAX_NUM; j++){
                    if (j < MAX_NUM && k == 2){
                        System.out.print(j);
                    }
                    else if (j < MAX_NUM && k == 1){
                        System.out.print(" ");
                    }
                    else if (j == MAX_NUM && k == 1){
                        System.out.print("|");
                    }
                    else if (j == MAX_NUM && k == 2){
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
}