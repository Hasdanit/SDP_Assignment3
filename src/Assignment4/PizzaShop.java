package src.Assignment4;

public class PizzaShop {

    private static Pizza createCustomPizza(){
        Pizza myPizza = new MargheritaPizza();

        myPizza = new CheeseTopping(myPizza);
        myPizza = new MushroomTopping(myPizza);

        return myPizza;
    }

    public static void main(String[] args){
        Pizza customPizza = createCustomPizza();

        System.out.println(customPizza.getDescription());
        System.out.printf("Total Cost: $%.2f%n", customPizza.getCost());
    }
}
