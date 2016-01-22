package Chapter9.Water;

/**
 * Created by Jami on 10/16/2015.
 */
public class ErrorTest {
    public static void main(String[] args){
        Pond var1 = new Bay();
        Object var2 = new Ocean();

        ((Lake) var1).method1();
        ((Bay) var1).method1();
        ((Pond) var2).method2();
        ((Lake) var2).method2();
        ((Ocean) var2).method3();
    }
}
