package AbstractFactory;

import Factory.Shape;

/**
 * Created by zero on 15-8-31.
 */
public class ColorFactory extends AbstractFactoty{
    public static final int RED = 4;
    public static final int BLUE = 5;
    public static final int YELLOW = 6;

    @Override
    public Color getColor(int color) {
        switch (color) {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            case YELLOW:
                return new Yellow();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(int shape) {
        return null;
    }
}
