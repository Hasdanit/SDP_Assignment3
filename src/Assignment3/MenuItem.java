package src.Assignment3;

import java.util.ArrayList;
import java.util.List;

public class MenuItem extends MenuComponent {
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public double getPrice() { return price; }

    @Override
    public void add(MenuComponent menuComponent){}
    @Override
    public void remove(MenuComponent menuComponent){}

    @Override
    public void print() {
        System.out.print("  " + getName());
        System.out.print(", $" + getPrice());
        System.out.println(" -- " + getDescription());
    }
}