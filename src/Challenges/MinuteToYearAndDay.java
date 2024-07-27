package Challenges;

public class MinuteToYearAndDay {
    public static void main(String[] args) {
        printYearsAndDays(42545353);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid Value");
            return;
        }

        long day = (minutes / (24 * 60)) % 365;
        long year = minutes / (60 * 24 * 365);
        System.out.print(minutes + " min = " + year + " y and " + day + " d");
    }
}