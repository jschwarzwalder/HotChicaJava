package Chapter9.Students;

/**
 * Created by Jami on 10/16/2015.
 */
public class UndergraduateStudent extends Student {
    private int year;

    public UndergraduateStudent(String name){
        super(name, 18);
        this.year = 0;

    }

    public static void main(String[] args){
        //Student Sally = new UndergraduateStudent("Sally");
        //System.out.println(Sally.age);
        //Sally.setAge(25);
        //System.out.println(Sally.age);

    }
}
