package Creational.Builder;

/**
 * Created by zero on 15-8-31.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }


    public abstract float price();
}
