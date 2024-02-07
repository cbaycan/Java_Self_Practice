package day11_practice_tasks;

public class PizzaClients {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.setInfo("small", 4,5);

        Pizza pizza2 = new Pizza();
        pizza2.setInfo("medium",1,1);

        Pizza pizza3 = new Pizza();
        pizza3.setInfo("large", 1,1);


        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);


        System.out.println(pizza1.calCost());
        System.out.println(pizza2.calCost());
        System.out.println(pizza3.calCost());

    }





}
