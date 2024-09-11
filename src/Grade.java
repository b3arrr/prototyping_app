public class Grade {
    private String grade;
    private int score;
    Grade(String grade, int score) {
        this.grade = grade;
        this.score = score;

    }
    public String getGrade() {
        return grade;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
