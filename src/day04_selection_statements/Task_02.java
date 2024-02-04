package day04_selection_statements;

public class Task_02 {
    public static void main(String[] args) {

        int a = 10;
        int b=2;
        int c=3;

        if (a<10) {
            b=1;
        } else if (a>10) {
            c=1;
        } else b=c=0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
