package day07_class_and_scanners_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "glass";
        item1.quantity =5;
        item1.unitPrice = 4;

        Item item2 = new Item();
        item2.itemName ="plastic";
        item2.quantity = 2;
        item2.unitPrice = 3;


        item1.calcCost();
        item2.calcCost();



    }
}
