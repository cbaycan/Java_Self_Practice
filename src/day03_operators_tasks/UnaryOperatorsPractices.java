package day03_operators_tasks;

public class UnaryOperatorsPractices {

    public static void main(String[] args) {

        int a = 50;
        a = --a + a++ + a-- + a++ ;
        // 49+49+50+49

        System.out.println(a);
    }
}
