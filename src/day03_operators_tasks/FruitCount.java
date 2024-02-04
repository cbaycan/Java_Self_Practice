package day03_operators_tasks;

public class FruitCount {

    public static void main(String[] args) {

        int appleCount = 5;
        int orangeCount = 6;
        int strawberryCount = 12;

        boolean result = (appleCount < orangeCount) || (orangeCount >= strawberryCount);

        System.out.println("Result is =" + result);


    }
}
