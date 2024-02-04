package day07_class_and_scanners_tasks;

import org.w3c.dom.ls.LSOutput;

public class Item {
public String itemName;
    public double unitPrice;
    public int quantity;

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public void calcCost(){

        double calcCost = unitPrice*quantity;
        System.out.println("Cost for " + itemName + " is $ " + calcCost );
    }




    }

