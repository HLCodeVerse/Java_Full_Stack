package Assignment_4.UniversityGradingSystem;

public class Course {
    private String cName;
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;
    private double bioMarks;

    public Course(String cName) {
        this.cName = cName;
    }

    public void setMarks(double math, double science, double english, double bio) {
        this.mathMarks = math;
        this.scienceMarks = science;
        this.englishMarks = english;
        this.bioMarks = bio;
    }

    public double percentage() {
        double totalMarks = mathMarks + scienceMarks + englishMarks + bioMarks;
        return (totalMarks / 400) * 100;
    }

    public String getCourseName() {
        return cName;
    }
}
