import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Grade> listGrades = new ArrayList<>();
        initializeGrades(listGrades);
        userProgramStart(listGrades);

    }




public static void userProgramStart(ArrayList<Grade>listGrades) {
    Scanner scanner = new Scanner(System.in);
    String comment = "You have not written a comment";
    int userInput = 0;

    while (true) {
        System.out.println("What do you wish to do?");
        System.out.println("1. Increment scores");
        System.out.println("2. Decrement scores");
        System.out.println("3. Log scores");
        System.out.println("4. Add comment");
        System.out.println("5. See comment");
        System.out.println("6. Quit application");
        boolean loop = true;
        while (loop) {
            try {
                userInput = scanner.nextInt();
                if (userInput < 1 || userInput > 6){
                    throw new Exception("number not in range");
                }
                loop = false;

            } catch (Exception e) {
                System.out.println("Not a number please try again.");
                throw new RuntimeException(e);
            }
        }

        switch(userInput) {
            case 1:
                promptUserModifyScore(listGrades, true);
                break;
            case 2:
                promptUserModifyScore(listGrades, false);
                break;
            case 3:
                logScore(listGrades);
                break;
            case 4:
                comment = addComment(comment);
                break;
            case 5:
                System.out.println(comment);
                break;
            case 6:
                System.out.println("Quitting application");
                System.exit(0);
            default:
                System.out.println("something went wrong");

        }
    }

}






    public static String addComment(String comment) {
        Scanner scanner = new Scanner(System.in);
        comment = scanner.nextLine();
        return comment;


    }
    public static void logScore (ArrayList<Grade>listGrades) {
        for (Grade grade : listGrades) {
            System.out.println(grade.getGrade() + " " + grade.getScore());
        }
    }
    public static void incrementScore(ArrayList<Grade> listGrades, int userInt) { //adds the score of the list item at user defined index
        Grade grade = listGrades.get(userInt - 1); //-1 since arraylist index begins from [0] not 1, but the user input is from 1-7
        addScore(grade);
    }
    public static void decrementScore(ArrayList<Grade> listGrades, int userInt) { //removes score of the list item at user defined index
        Grade grade = listGrades.get(userInt - 1); //-1 since arraylist index begins from [0] not 1, but the user input is from 1-7
        removeScore(grade);
    }
    public static void removeScore(Grade grade) {
        int score = grade.getScore();
        score--;
        grade.setScore(score);
    }
    public static void addScore(Grade grade){
        int score = grade.getScore();
        score++;
        grade.setScore(score);
    }
    public static void promptUserModifyScore(ArrayList<Grade> listGrades, boolean increment) {  //method that allows the user to choose which grade to add points to

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
                if (increment == true) {
                    incrementScore(listGrades, userInput);
                }
                else {
                    decrementScore(listGrades, userInput);
                }
            }
            else {
                loop = false;
            }
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