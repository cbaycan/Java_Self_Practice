package day04_selection_statements;

public class LaptopModel {
    public static void main(String[] args) {

        String laptopmodel = "Apple";

        switch (laptopmodel){
            case "Apple":
                System.out.println("Apple - no virus");
                break;
            case "Dell":
                System.out.println("Though one");
                break;
            case "HP":
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy that one");

        }
    }
}
