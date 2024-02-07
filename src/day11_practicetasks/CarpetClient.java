package day11_practicetasks;

public class CarpetClient {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        carpet1.setInfo(1,4,150,true);

        Carpet carpet2 = new Carpet();
        carpet2.setInfo(1,4,150,false);

        System.out.println( carpet1);
        System.out.println(carpet2);
        System.out.println("Carpet 1 price :"+ carpet1.calcCost());
        System.out.println("Carpet 2 price :"+carpet2.calcCost());

    }
}
