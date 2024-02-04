package day09_practice_tasks;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int indexNumOfGloves = 0;
        boolean hasiPad = false;
        String report ="";

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int ID = itemIDs[i];

            if(item.equals("Gloves")){
                indexNumOfGloves =i;
            }
            if(item.equals("iPad")){
                hasiPad=true;
            }
            report += item + "-" + price + "-" + ID + "\n";


        }

        System.out.println(indexNumOfGloves);
        System.out.println(hasiPad);
        System.out.println(report);


    }

}
