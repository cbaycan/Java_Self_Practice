package day04_selection_statements;

public class TrafficLightColors {
    public static void main(String[] args) {

        char color = 'G';

        switch (color){
            case 'r' :
            case 'R':
                System.out.println("Red");
                break;
            case 'y' :
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'g' :
            case 'G':
                System.out.println("Green");
                break;

                default:{
                System.out.println("Invalid");
            }
        }

    }
}
