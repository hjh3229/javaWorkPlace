package Javajigi.Calendar;

public class CalendarMaking_2 {
        private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        public boolean isLeepYear(int year) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }

        public int getMaxDaysOfMonth(int year, int month) {
            if (isLeepYear(year)) {
                return LEAP_MAX_DAYS[month - 1];
            } else return MAX_DAYS[month - 1];
        }

        public void printCalendar(int year, int month, String day) {
            System.out.printf("   <<%4d년%3d월>>\n", year, month);
            System.out.println(" SU MO TU WE TH FR SA");
            System.out.println("-----------------------");

            int maxday = getMaxDaysOfMonth(year, month);

            switch (day) {
                case "SU":
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 0) {
                            System.out.println();
                        }
                    }
                    break;
                case "MO":
                    System.out.print("   ");
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 6) {
                            System.out.println();
                        }
                    }
                    break;
                case "TU":
                    System.out.print("      ");
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 5) {
                            System.out.println();
                        }
                    }
                    break;
                case "WE":
                    System.out.print("         ");
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 4) {
                            System.out.println();
                        }
                    }
                    break;
                case "TH":
                    System.out.print("            ");
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 3) {
                            System.out.println();
                        }
                    }
                    break;
                case "FR":
                    System.out.print("               ");
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 2) {
                            System.out.println();
                        }
                    }
                    break;
                case "SA":
                    System.out.print("                  ");
                    for (int i = 1; i <= maxday; i++) {
                        System.out.printf("%3d", i);
                        if (i % 7 == 1) {
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("실패");
                    break;
            }
            System.out.println();
        }
}
