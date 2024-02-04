package day05_loops;

public class KphToMph {
    public static void main(String[] args) {


        System.out.println("KPH\t\tMPH");
        System.out.println("------------------");
        for (int kph = 20; kph <= 140; kph+=10) {
            System.out.println(kph + "\t\t" + (kph*0.62));

        }

    }
}
