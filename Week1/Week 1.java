////Java Week 1
//
///**
// * Created by Jami on 8/19/2015.
// */
//
// public class Hello {
//    public static void main(String[] args){
//        System.out.println("Hello World!");
//    }
//}
//
//public class FoBarBazMumble {
//    public static void main(String[] args){
//        foo();
//        System.out.print(" - ");
//        bar();
//        System.out.print(" - ");
//        System.out.print("mumble");
//    }
//
//    public static void foo(){
//        System.out.print("foo");
//    }
//
//    public static void baz(){
//        System.out.print("baz");
//    }
//
//    public static void bar(){
//        baz();
//        System.out.print("bar");
//    }
//
//
//}
//
///**
//6. Which of the following can be used in a Java Program as identifiers:
//println
//AnnualSalary
//ABC
//sum_of_data
//_average
//B4
//
//cannot:
//first-name
//for
//42isTheAnswer
//"hello"
//**/
//
//// 8. What is the output produced from the following statements?
//public class Eight {
//    public static void main(String[] args){
//        System.out.println("\"Quotes\"");
//// "Quotes"
//        System.out.println("Slashes \\//");
//// Slashes \//
//        System.out.println("How '\"confounding' \"\\\" it is!");
//// How '"confounding' "\" it is!
//    }
//}
//
///** 15.
// Write a println statement that produces the following output:
// / \ // \\ /// \\\
//**/
//
//public class Fifteen {
//    public static void main(String[] args){
//        System.out.println("/ \\ // \\\\ /// \\\\\\");
//    }
//}
//
////18. Name the errors in the following program
//
//public MyProgram{ //no class
//	public static void main(String[] args){
//		System.out.println("This is a test of the")//;
//		System.out.Print("emergencey broadcast system."); //Print is capitalized
//	}
//}
//	}
//}
//
///** 23.
//What is the output of the following program?
//Inside the first method //first()
//Inside the third method //third()
//Inside the first method
//Inside the second method
//Inside the first method
//Inside the second method //second()
//Inside the first method
//Inside the third method //third()
//Inside the first method
//Inside the second method
//Inside the first method
//**/
//
//public class Strange{
//	public static void first(){
//		System.out.println("Inside the first method");
//	}
//
//	public static void second(){
//		System.out.println("Inside the second method");
//		first();
//	}
//
//	public static void third(){
//		System.out.println("Inside the third method");
//		first();
//		second();
//	}
//
//	public static void main(String[] args){
//		first();
//		third();
//		second();
//		third();
//	}
//}
