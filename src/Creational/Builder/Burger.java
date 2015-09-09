package Creational.Builder;

/**
 * Created by zero on 15-8-31.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
