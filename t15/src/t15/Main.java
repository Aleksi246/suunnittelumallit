package t15;
//AI testit
public class Main {
    private static void assertDate(NewDateInterface calendar, int expectedDay, int expectedMonth, int expectedYear, String testName) {
        int actualDay = calendar.getDay();
        int actualMonth = calendar.getMonth();
        int actualYear = calendar.getYear();

        if (actualDay != expectedDay || actualMonth != expectedMonth || actualYear != expectedYear) {
            throw new IllegalStateException(
                testName + " failed. Expected "
                    + expectedDay + "/" + expectedMonth + "/" + expectedYear
                    + " but was "
                    + actualDay + "/" + actualMonth + "/" + actualYear
            );
        }

        System.out.println(testName + " passed");
    }

    public static void main(String[] args) {
        NewDateInterface calendar = new CalendarToNewDateAdapter();

        calendar.setDay(1);
        calendar.setMonth(0);
        calendar.setYear(2000);
        assertDate(calendar, 1, 0, 2000, "setters and getters");

        calendar.advanceDays(10);
        assertDate(calendar, 11, 0, 2000, "advance within same month");

        calendar.setDay(25);
        calendar.setMonth(11);
        calendar.setYear(2023);
        calendar.advanceDays(10);
        assertDate(calendar, 4, 0, 2024, "advance over year boundary");

        calendar.setDay(28);
        calendar.setMonth(1);
        calendar.setYear(2024);
        calendar.advanceDays(1);
        assertDate(calendar, 29, 1, 2024, "leap year handling");

        System.out.println("All adapter tests passed.");
    }
}
