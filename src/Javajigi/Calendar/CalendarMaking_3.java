package Javajigi.Calendar;

public class CalendarMaking_3 {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public boolean isLeepYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public int firstDayOfNextYear(int year, int month) {
        int firstDayOfYear = 3;
        for (int i = 0; i < (year - 1902); i++) {
            if (isLeepYear((1902 + i + 1))) {
                firstDayOfYear += 2;
            } else {
                firstDayOfYear += 1;
            }
        }

        for (int j = 0; j < (month - 1); j++) {
            firstDayOfYear += ((getMaxDaysOfMonth(year, (1 + j)))%7);
        }
        if (isLeepYear(year)) firstDayOfYear -= 1;
        return (firstDayOfYear%7);
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if (isLeepYear(year)) {
            return LEAP_MAX_DAYS[month - 1];
        } else return MAX_DAYS[month - 1];
    }

    public void printCalendar(int year, int month) {
        System.out.printf("   <<%4d년%3d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("-----------------------");

        int weekday = firstDayOfNextYear(year,month);

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
}
