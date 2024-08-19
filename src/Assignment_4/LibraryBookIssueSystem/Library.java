package Assignment_4.LibraryBookIssueSystem;

public class Library {

    private int maxDay=15;
    private double finePerDay =5;
    private double fineAmount;
    private int keptDays;

    public double getFineAmount ( ) {
        return fineAmount;
    }

    public void setFineAmount ( double fineAmount ) {
        this.fineAmount = fineAmount;
    }

    public double getFinePerDay ( ) {
        return finePerDay;
    }

    public int getKeptDays ( ) {
        return keptDays;
    }

    public void setKeptDays ( int keptDays ) {
        this.keptDays = keptDays;
    }

    public int getMaxDay ( ) {
        return maxDay;
    }

    public void setMaxDay ( int maxDay ) {
        this.maxDay = maxDay;
    }
    Book book1=new Book();
    Book book2=new Book();
    Student student1=new Student();

    public  void Books(){
        System.out.println ("--Avialable Books in Library--" );
        System.out.println (book1.getBookName());
        System.out.println (book2.getBookName());
    }
}
