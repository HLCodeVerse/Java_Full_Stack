package Assignment_4.StudentAttendanceSystem;

public class Student {
    private String sName;
    private int rollNumber;
    private String className;
    private int monthlyAttendance;
    private int totalAttandance;

    public String getsName ( ) {
        return sName;
    }

    public int getRollNumber ( ) {
        return rollNumber;
    }

    public String getClassName ( ) {
        return className;
    }

    public int getMonthlyAttendance ( ) {
        return monthlyAttendance;
    }

    Student( String sName, int rollNumber, String className, int monthlyAttendance){
        this.sName = sName;
        this.rollNumber = rollNumber;
        this.className = className;
        this.monthlyAttendance = monthlyAttendance;
    }
}
