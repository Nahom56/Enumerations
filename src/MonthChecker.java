public class MonthChecker {

    // Define an enumeration for months
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        // Loop through each value in the Month enumeration
        for (Month month : Month.values()) {
            // Get the name of the month as a string
            String monthName = month.name();

            // Check if the month name ends with "Y" (case-insensitive)
            if (monthName.endsWith("Y")) {
                System.out.println(monthName + " ends with y");
            } else {
                System.out.println(monthName + " doesn't end with y");
            }
        }
    }
}