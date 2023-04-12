package day13;

import static day13.Dish.*;

public class DishNamenType {
    private final String name;
    private final Type type;


    public DishNamenType(Dish dish  ) {
        this.name = dish.getName();
        this.type = dish.getType();
    }

    @Override
    public String toString() {
        return "DishNamenType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
