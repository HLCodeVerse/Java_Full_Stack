package Assignment_4.UniversityGradingSystem;

public class Grade {
    private String grade;

    public String calculateGrade(double percent) {
        if (percent >= 90) {
            grade = "A";
        } else if (percent >= 80) {
            grade = "B";
        } else if (percent >= 70) {
            grade = "C";
        } else if (percent >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
