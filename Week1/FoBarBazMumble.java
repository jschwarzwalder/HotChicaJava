/**
 * Created by Jami on 8/19/2015.
 */
public class FoBarBazMumble {
    public static void main(String[] args){
        foo();
        System.out.print(" - ");
        bar();
        System.out.print(" - ");
        System.out.print("mumble");
    }

    public static void foo(){
        System.out.print("foo");
    }

    public static void baz(){
        System.out.print("baz");
    }

    public static void bar(){
        baz();
        System.out.print("bar");
    }


}
