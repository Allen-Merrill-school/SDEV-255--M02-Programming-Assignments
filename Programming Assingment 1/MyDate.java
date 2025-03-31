import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    //The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.
    private int year;
    private int month;
    private int day;

    //A no-arg constructor that creates a MyDate object for the current date.
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    //A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    //A constructor that constructs a MyDate object with the specified year, month, and day.
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Three getter methods for the data fields year, month, and day, respectively.
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    //main to run
    public static void main(String[] args) {
        MyDate currentDate = new MyDate();
        System.out.println("Current date:");
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Month: " + (currentDate.getMonth() + 1)); 
        System.out.println("Day: " + currentDate.getDay());

        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("\nDate from elapsed time:");
        System.out.println("Year: " + specificDate.getYear());
        System.out.println("Month: " + (specificDate.getMonth() + 1));
        System.out.println("Day: " + specificDate.getDay());
    }
}
