package day06_methods_tasks;

public class DayAndMonth {
    public static void main(String[] args) {

        String day = day(9);
        System.out.println(day);
        String month = monthName(5);

        System.out.println(month);

    }

public static String day(int num) {
    if (num == 1) {
        return "Monday";
    } else if (num == 2) {
        return "Tuesday";
    } else if (num == 3) {
        return "Wednesday";
    } else if (num == 4) {
        return "Thursday";
    } else if (num == 5) {
        return "Friday";
    } else if (num == 6) {
        return "Saturday";
    } else if (num == 7) {
        return "Sunday";
    } else {
        return "Invalid Day";
    }
}
    public static String monthName ( int month){
 String numberOfDays = daysInMonth(month);
        String result = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        return result + " has " + numberOfDays;
    }
    public static String daysInMonth(int daysInMonth){
        switch (daysInMonth){
            case 1,3,5,7,8,10,12:
                return "31 days";
            case 4, 6, 9, 11:
                return "30 days";
            case 2:
                return "28 days";
            default:
                return "Invalid";
        }
    }
}












