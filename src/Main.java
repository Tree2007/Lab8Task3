import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "What is your birth year?", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "What month were you born?", 1, 12);
        int day;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = InputHelper.getRangedInt(scan, "What day were you born?", 1, 31);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = InputHelper.getRangedInt(scan, "What day were you born?", 1, 30);
        } else {
            day = InputHelper.getRangedInt(scan, "What day were you born?", 1, 29);
        }
        int hour = InputHelper.getRangedInt(scan, "What hour?", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "What minute?", 1, 59);
        System.out.printf("%s %-3d \n", "Year:", year);
        System.out.printf("%s %-3d \n", "Month:", month);
        System.out.printf("%s %-3d \n", "Day:", day);
        System.out.printf("%s %-3d \n", "Hour:", hour);
        System.out.printf("%s %-3d \n", "Minute:", minute);

    }
}