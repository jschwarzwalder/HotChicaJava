/**
 * Created by Jami on 8/19/2015.
 */
public class Strange{
    public static void first(){
        System.out.println("Inside the first method");
    }

    public static void second(){
        System.out.println("Inside the second method");
        first();
    }

    public static void third(){
        System.out.println("Inside the third method");
        first();
        second();
    }

    public static void main(String[] args){
        first();
        third();
        second();
        third();
    }
}
