/*Week 2
1. Which of the following are legal int literals?
	22		-1		-6875309 
not 1.5		2.3		10.0	5.	'7'

2.
a 2 + 3 * 4 - 6
	2 + 12 - 6
	14 -6 = 8
b 14/7 * 2 + 30 /5 + 1
	2 * 2 + 6 +1
	4 + 6 + 1 = 11
c (12+3)/ 4 * 2
	15 /4 * 2
	3 * 2 = 6
d (238 % 10 + 3) % 7
	(8 + 3) % 7
	11 % 7 = 4
e (18 -7) * ( 43 % 10)
	11 * 3 = 33
	
7.  double gpa;
	public enum Year{
		FRESHMAN, SOPHMORE, JUNIOR, SENIOR
	}
	Year studentYear;
	int numClasses;
-->	
18. */
public class Count2 {
	public static void main (String[] args){
		for (int i = 1; i < 5; i++ ){
			System.out.println("2 times " + i + " = " + i*2 );
		}
	}
}

//Exercise 10

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


//Exercise 11

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