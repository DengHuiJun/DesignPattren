package Builder;

/**
 * Created by zero on 15-8-31.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
