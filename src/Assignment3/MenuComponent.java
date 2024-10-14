package src.Assignment3;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String description;

    public abstract String getName();
    public abstract String getDescription();
    public abstract double getPrice();
    public abstract void print();
    public abstract void add(MenuComponent menuComponent);
    public abstract void remove(MenuComponent menuComponent);
}