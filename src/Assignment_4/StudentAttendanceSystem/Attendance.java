package Assignment_4.StudentAttendanceSystem;

public class Attendance {

    public void totalAttendance(int totalAttendanceOfAMonth) {
      int totalAttendance=totalAttendanceOfAMonth*10; //10  months in an academinc year
        System.out.println ("Your Total attendance is : "+totalAttendance );
        float percentage=totalAttendance*100/280;
        System.out.println ("Your total attendance in percentage : "+percentage );
    }
}
