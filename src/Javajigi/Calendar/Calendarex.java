package Javajigi.Calendar;

public class Calendarex {

    private static final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public boolean isLeepYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeepYear(year)) {
            return LEAP_MAX_DAYS[month];
        } else return MAX_DAYS[month];
    }


    public void printCalendar(int year, int month) {
        System.out.printf("   <<%d년 %d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("-----------------------");

        //get weekday automatically
        int weekday = getWeekDay(year, month);

        for (int i = 0; i < weekday; i++) {
            System.out.print("   ");
        }
        int maxday = getMaxDaysOfMonth(year, month);

        for(int i = 1; i <= maxday; i++) {
            System.out.printf("%3d", i);
            if ((i+weekday)%7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    private int getWeekDay(int year, int month) {
        int syear = 1970;
        final int STANDARD_WEEKDAY = 4;

        int count = 0;

        for (int i = syear; i < year; i++) {
            int delta = isLeepYear(i) ? 366 : 365;
            count += delta;
        }

        for (int i = 1; i < month; i++) {
            int delta = getMaxDaysOfMonth(year, i);
            count += delta;
        }

        return (count + STANDARD_WEEKDAY)%7;
    }
}
