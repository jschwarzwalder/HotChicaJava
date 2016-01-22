/**
 * Created by Jami on 9/5/2015.
 */

import java.util.*;

public class Grades {
     static double HOMEWORK;
     static double MIDTERM;
     static double FINAL;
     static double GRADE;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        homework(console);
        midterm(console);
        //have you taken the final?
        final_grade(console);
    }
    public static double homework(Scanner console) {
        //prompt number of homework assignments
        System.out.println("How many homework assignments did you have?");
        int num_homework = console.nextInt();
        //prompt for percentage of final grade
        System.out.println("What percentage of your grade is homework assignments worth?");
        HOMEWORK = console.nextDouble();
        double real_homework = 0;
        int potential_homework = 0;
        for (int i = 1; i <= num_homework; i++) {
            //prompt points earned on homework assignment
            System.out.println("How many total points was assignment " + i + " worth?");
            potential_homework += console.nextInt();
            //prompt points possible on homework assignment
            System.out.println("How much did you earn?");
            real_homework += console.nextDouble();
        }

        HOMEWORK = HOMEWORK*(real_homework/potential_homework);
        return HOMEWORK;
    }
    public static double midterm(Scanner console) {
        //prompt for midterm
        System.out.println("What percentage of your grade is midterm worth?");
        MIDTERM = console.nextDouble();
        System.out.println("How many total points was your midterm worth?");
        int potential_midterm = console.nextInt();
        System.out.println("How much did you earn?");
        double real_midterm = console.nextDouble();

        MIDTERM = MIDTERM*(real_midterm/potential_midterm);
        return MIDTERM;

    }
    public static double final_grade(Scanner console) {
        System.out.println("What percentage of your grade is final worth?");
        FINAL = console.nextDouble();
        System.out.println("How much is final worth?");
        int potential_final = console.nextInt();
        //prompt for percentage of final grade
                System.out.println("True or False. I have already taken my final.");
        boolean taken_final = console.nextBoolean();
        if (taken_final) {
            //if they've taken final what grade did they get
            System.out.println("How much did you earn on final?");
            double real_final = console.nextDouble();
            FINAL = FINAL * (real_final/potential_final);
            System.out.println();

            GRADE = FINAL + HOMEWORK + MIDTERM;
            if (Math.abs(GRADE)>=80) {
                System.out.printf("Congratulations you have earned %.2f in your class", GRADE);
                return GRADE;
            } else {
                System.out.printf("Your final grade was %.2f", GRADE);
                return GRADE;
            }
        }
        else {
            System.out.println("What grade do you want to make in the class?");
            double wish_grade = console.nextDouble();
            double final_need = ((wish_grade - MIDTERM - HOMEWORK)/FINAL)*potential_final;
            System.out.printf("You will need to get %1.2f out of %d to have a final grade of %.0f", final_need, potential_final, wish_grade);
            return wish_grade;
        }


    }
}
