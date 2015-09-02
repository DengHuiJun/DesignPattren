package Builder;

/**
 * Created by zero on 15-8-31.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5f;
    }
}
