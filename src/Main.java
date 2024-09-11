import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*GradeManager manager = new GradeManager();*/
        ArrayList<Grade> listGrades = new ArrayList<>();
        initializeGrades(listGrades);
        userAddScore(listGrades);

        for (Grade grade : listGrades) {
            System.out.println(grade.getGrade() + " " + grade.getScore());
        }




    }
    public static void scorePlus(ArrayList<Grade> listGrades, int userInt) { //adds the score of the list item at user defined index
        Grade grade = listGrades.get(userInt -1); //-1 since arraylist index begins from [0] not 1, but the user input is from 1-7
        addScore(grade);
    }
    public static void scoreMinus(ArrayList<Grade> listGrades, int userInt) { //removes score of the list item at user defined index
        Grade grade = listGrades.get(userInt - 1); //-1 since arraylist index begins from [0] not 1, but the user input is from 1-7
        removeScore(grade);
    }
    public static void removeScore(Grade grade) {
        int score = grade.getScore();
        score--;
    }
    public static void addScore(Grade grade){
        int score = grade.getScore();
        score++;
    }
    public static void userAddScore(ArrayList<Grade> listGrades) {  //method that allows the user to choose which grade to add points to

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int userInput = 0;
        while (loop) {
            System.out.println("Enter which grade to add points");
            System.out.println("1. White");
            System.out.println("2. Green");
            System.out.println("3. Blue");
            System.out.println("4. Yellow");
            System.out.println("5. Red");
            System.out.println("6. Black");
            System.out.println("7. Quit");
            boolean eLoop = true; //Boolean loop value for the inner loop with a try catch method to see validate that the user input is an integer value.
            while (eLoop) {
                try {
                    userInput = scanner.nextInt();
                    if (userInput < 1 || userInput > 7) {
                        throw new Exception("Number not in range");
                    }
                    eLoop = false;
                } catch (Exception e) {
                    System.out.println("Please write a number that is within 1-7");
                }
            }

            if (userInput != 7) {
                System.out.println("Added 1 to case:  " + userInput);
                scorePlus(listGrades, userInput);
            }
            else {
                loop = false;
            }

          /*  switch (userInput) {
                case 1:
                    System.out.println("case 1");
                    scorePlus(userInput);
                    break;
                case 2:
                    System.out.println("case 2");
                    scorePlus(userInput);
                    break;
                case 3:
                    System.out.println("case 3");
                    scorePlus(userInput);
                    break;
                case 4:
                    System.out.println("case 4");
                    scorePlus(userInput);
                    break;
                case 5:
                    System.out.println("case 5");
                    scorePlus(userInput);
                    break;
                case 6:
                    System.out.println("case 6");
                    scorePlus(userInput);
                    break;
                case 7:
                    System.out.println("case 7");
                    loop = false;
                    break;
                default:
                    System.out.println("default something wrong");
            }*/


        }


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