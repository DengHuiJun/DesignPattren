import AbstractFactory.AbstractFactoty;
import AbstractFactory.FactoryProducer;
import Adapter.AudioPlayer;
import Builder.Meal;
import Builder.MealBuilder;
import Factory.Shape;
import Factory.ShapeFactory;
import Prototype.ShapeCache;

/**
 * Created by zero on 15-8-28.
 */
public class Main {

    public static void main(String[] args) {
//        testFactory();
//        testAbstractFactory();
//        testBuilder();
//        testPrototype();
        testAdapter();
    }

    public static void testFactory() {
        ShapeFactory shapeFactory  = new ShapeFactory();
        Shape c = shapeFactory.getShape(ShapeFactory.CIRCLE);
        c.draw();
    }

    public static void testAbstractFactory() {
        AbstractFactoty shapeFactory = FactoryProducer.getFactory("SHAPE");
    }

    public static void testBuilder() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.getMealVegCoke();
        Meal meal2 = mealBuilder.getMealChickPesi();

        meal1.showItems();
        meal2.showItems();
    }

    public static void testPrototype() {
        ShapeCache.loadCache();
        Prototype.Shape clonedShape = (Prototype.Shape) ShapeCache.getShape("1");
        clonedShape.setName("CIRCLE");
        System.out.println("Shape : " + clonedShape.getType() + clonedShape.getName());
        Prototype.Shape clonedShape2 = (Prototype.Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape2.getType() + clonedShape2.getName());
        Prototype.Shape clonedShape3 = (Prototype.Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

    public static void testAdapter() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    public static void testFlyweight() {

    }
}
