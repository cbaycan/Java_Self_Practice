package day03_operators_tasks;

public class EligibleForWork {
    public static void main(String[] args) {

        int birthYear = 1957 ;
        int currentYear = 2024 ;
        int minAge = 18;
        int maxAge = 65;


        boolean isEligible = ((currentYear - birthYear) <= maxAge) & ((currentYear - birthYear) >= minAge);


        System.out.println("Am I eligible to work? " + isEligible);


    }
}
