# Grade Manager Application

This Java console application allows users to manage scores for different grades, color-coded by name. The user can increment or decrement the scores, log the current scores, add a comment, and quit the application.

## Features
- **Increment/Decrement Scores**: Users can increase or decrease the score of each grade.
- **Log Scores**: The current scores of all grades can be displayed.
- **Add Comment**: Users can add and display a custom comment.
- **Quit Application**: Option to exit the program at any point.

## How It Works
The program uses an `ArrayList` of `Grade` objects where each grade has a color (e.g., White, Green, etc.) and a score. The user can interact with the program via a text-based menu to modify the scores, view comments, and quit the program.

### Menu Options:
1. **Increment Scores**: Choose a grade and increment its score by 1.
2. **Decrement Scores**: Choose a grade and decrement its score by 1.
3. **Log Scores**: View the current scores for all grades.
4. **Add Comment**: Add a comment to the current session.
5. **See Comment**: Display the current comment.
6. **Quit Application**: Exit the program.

## How to Use

1. Clone the repository and open the project in your favorite Java IDE.
2. Run the `Main` class, which will start the program.
3. Follow the menu options to increment, decrement scores, or log the results.
4. Add and view comments as needed.
5. Quit the program by selecting the appropriate menu option.
