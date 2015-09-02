package Builder;

/**
 * Created by zero on 15-8-31.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.5f;
    }
}
