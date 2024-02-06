package day11_practicetasks;

import org.w3c.dom.ls.LSOutput;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public void setInfo(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public int calCost() {
       int sizePrice=  (size.equalsIgnoreCase("small"))? 10 :
        (size.equalsIgnoreCase("medium"))? 12:
                (size.equalsIgnoreCase("large"))? 14: 0;
       int totalCost = sizePrice+ ((numberOfPepperoniTopping+numberOfCheeseTopping)*2);
       return totalCost;

    }

}





/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */