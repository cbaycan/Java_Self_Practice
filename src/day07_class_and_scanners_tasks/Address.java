package day07_class_and_scanners_tasks;

public class Address {
    public String  street, city, state;
    public int buildingNumber, zipCode ;

public void addressInfo(){
    System.out.println(buildingNumber +" " + street  + "\n" + city + state + " " + zipCode + "\n\n" );
}

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", zipCode=" + zipCode +
                '}';
    }
}
