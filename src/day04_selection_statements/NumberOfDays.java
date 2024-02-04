package day04_selection_statements;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 2;

        String result = switch (month){
            case 1,3,5,7,8,10,12 -> "31 days";
            case 4,6,9,11 -> "30 days";
            case 2 -> "28 days";
            default -> "invalid";
        };

        System.out.println(result);



    }
}
