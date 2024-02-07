package day11_practicetasks;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

    public String makeOrder(){
        return name+ " is making an order.";
    }
    public String washDishes(){
        return name+ " is washing the dishes.";
    }

}
/*
Create a custom class named Chef with the following specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

	Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status


 */