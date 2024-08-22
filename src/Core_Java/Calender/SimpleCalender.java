package Core_Java.Calender;

import java.util.Calendar;

public class SimpleCalender {
    public static void main ( String[] args ) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String mon="";

        if(month>0 && month<=9){
            //concate 0 if month in between 1 - 9
            mon="0"+month;
        }
        else {
            //if month greater than 9 then calendar month will print
            mon= String.valueOf ( month );
        }
        System.out.println (day+"-"+mon+"-"+year );
    }
}
