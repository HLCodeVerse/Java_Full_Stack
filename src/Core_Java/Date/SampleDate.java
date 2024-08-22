package Core_Java.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class SampleDate {
    public static void main ( String[] args ) {
        Date date = new Date();
        System.out.println (date );
        SimpleDateFormat sdf = new SimpleDateFormat("E dd-MM-YYYY hh:mm");
        System.out.println (sdf.format ( date ) );
        System.out.println ("current Day");
    }
}
