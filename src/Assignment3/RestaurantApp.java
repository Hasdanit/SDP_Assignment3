package src.Assignment3;

import java.util.ArrayList;
import java.util.List;

public class RestaurantApp {
    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");

        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desserts");

        pancakeHouseMenu.add(new MenuItem("Pancake Breakfast", "Pancakes with eggs and toast", 2.99));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", 2.99));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust", 1.59));

        dinerMenu.add(dessertMenu);

        pancakeHouseMenu.print();
        dinerMenu.print();
    }
}
