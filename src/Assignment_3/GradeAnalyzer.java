package Assignment_3;

import java.util.Scanner;
class Students{
    private String name;
    private String id;
     float grade;
    Students(String name, String id, float grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public void addStudent(){
        Scanner scanner = new Scanner ( System.in);
        System.out.println ("Student name : " );
        name=scanner.nextLine();
        System.out.println ("Student id : " );
        id=scanner.nextLine();
        System.out.println ("Student grade : " );
        grade=scanner.nextFloat ();
    }
    public void details(){
        System.out.println ("Student name : "+name );
        System.out.println ("Student id: "+id );
        System.out.println ("Grade is : "+grade );
    }
    public static float avarageGrade(float grade1, float grade2){
            float avarageGrade=(grade1+grade2)/2;
        return avarageGrade;
    }
    public static float highestGrade(float grade1, float grade2){
        float highestGrade=0;
        if(grade1>grade2)
            System.out.println ("High grade is : "+grade1 );
        else
            System.out.println ("Highest grade is : "+grade2 );
        return highestGrade;
    }
    public static  float lowestGrade(float grade1, float grade2){
        float lowestGrade=0;
        if(grade1<grade2)
            System.out.println ("Lowest grade is : "+grade1 );
        else
            System.out.println ("Lowest grade is : "+grade2 );
        return lowestGrade;
    }
}

public class GradeAnalyzer {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in);
        Students s1 = new Students("","",0);
        Students s2 = new Students("","",0);
        int choice=0;
        while ( choice !=6){
            System.out.println ("Choose an option" );
            System.out.println ("1. Add Student" );
            System.out.println ("-----------Student Statistics----------" );
            System.out.println ("2. View avarage Grade" );
            System.out.println ("3. Check Highest grade" );
            System.out.println ("4.Check Lowest Grade" );
            System.out.println ("5. generate report" );
            System.out.println ("6. Exit" );
            choice=scanner.nextInt ();
            switch(choice){
                case 1:
                    s1.addStudent ();
                    s2.addStudent ();
                    break;
                case 2:
                    System.out.println ("Avarage grade is: "+ Students.avarageGrade(s1.grade,s2.grade));
                    break;
                case 3:
                    Students.highestGrade ( s1.grade,s2.grade );
                    break;
                case 4:
                    Students.lowestGrade ( s1.grade,s2.grade );
                    break;
                case 5:
                    System.out.println ("Students report" );
                    System.out.println ("-------------------------" );
                    System.out.println ("Student 1" );
                    s1.details ();
                    System.out.println ("Student 2" );
                    s2.details ();
                    System.out.println ("---------------------------" );
                    break;
                case 6:
                    System.out.println ("Exit" );
                    break;
            }
        }
    }
}
