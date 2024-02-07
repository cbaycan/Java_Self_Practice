package day11_practicetasks;

import org.w3c.dom.ls.LSOutput;

public class Carpet {
    public double width;
    public double  length;
    public double unitPrice;
    public boolean isPersian;




    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    public double calcCost() {
           double totalCost = (width * length) * unitPrice;
           double persianCost = totalCost+200;
           double finalCost = (isPersian==true)? persianCost:
                   totalCost;
           return finalCost;
        }

}



/*

2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.

 */