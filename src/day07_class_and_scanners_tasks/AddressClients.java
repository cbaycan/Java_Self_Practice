package day07_class_and_scanners_tasks;

import java.sql.SQLOutput;

public class AddressClients {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 234;
        address1.street = "S 50TH ST";
        address1.zipCode= 85048;
        address1.city = "Phoenix";
        address1.state = "AZ";

        Address address2 = new Address();
        address2.buildingNumber = 2033;
        address2.street = "HOLLYWOOD BLVD";
        address2.zipCode= 33020;
        address2.city = "Miami";
        address2.state = "FL";
        System.out.println("First address is : ");
        address1.addressInfo();
        System.out.println("Second address is : ");
        address2.addressInfo();


    }
}
