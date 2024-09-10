import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        /*GradeManager manager = new GradeManager();*/
        ArrayList<Grade> listGrades = new ArrayList<>();

        initializeGrades(listGrades);

        for (Grade grade : listGrades) {
            System.out.println(grade.getGrade() + " " + grade.getScore());
        }

    }

    public static void usedAddScore () {  //method that allows the user to choose which grade to add points to
        System.out.println("Enter which grade to add points");
        Scanner scanner = new Scanner(System.in);

    }

    public static void initializeGrades(ArrayList<Grade> listGrades) {
        listGrades.add(new Grade("white", 0));
        listGrades.add(new Grade("blue", 0));
        listGrades.add(new Grade("yellow", 0));
        listGrades.add(new Grade("red", 0));
        listGrades.add(new Grade("black", 0));
    }
}


//have set color coded grades
//User should increase and decrease the amount he has done each grade

//create class for managing grades
//class gradeManager
//make instance/object of gradeManager for each colored grade
//gradeManager has arrayList as an attribute
//gradeManager has color grade as an attribute

//user have options 1. increment grade by 1     2. Decrement grade by 1       3. view current session       4. Save & log       5. Quit