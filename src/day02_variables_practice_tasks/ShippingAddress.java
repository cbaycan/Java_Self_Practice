package day02_variables_practice_tasks;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName;
        String buildingNumber;
        String streetName;
        String city;
        String state;
        String zipCode;

        fullName = "Aaron Kissinger";
        buildingNumber = "13621";
        streetName = "Legacy Circle";
        city = "Fairfax";
        state = "VA";
        zipCode = "22030";
        System.out.println("Your shipping address is:");
        System.out.println("        " + fullName);
        System.out.println("        " + buildingNumber + streetName);
        System.out.println("        " + city + ", " + state + zipCode);



    }
}
