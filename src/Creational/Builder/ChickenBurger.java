package Creational.Builder;

/**
 * Created by zero on 15-8-31.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
