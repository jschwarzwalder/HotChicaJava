/**
 * Created by Jami on 8/30/2015.
 */
public class Routing {

    public static void main(String[] args){
        for (int k = 1; k <= 2; k++){
            for (int i = 1; i <= 6; i++){
                for (int j = 1; j <= 10; j++){
                    if (j < 10 && k == 2){
                        System.out.print(j);
                    }
                    else if (j < 10 && k == 1){
                        System.out.print(" ");
                    }
                    else if (j == 10 && k == 1){
                        System.out.print("|");
                    }
                    else if (j == 10 && k == 2){
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
}
