import Creational.AbstractFactory.AbstractFactoty;
import Creational.AbstractFactory.FactoryProducer;
import Structural.Adapter.AudioPlayer;
import Creational.Builder.Meal;
import Creational.Builder.MealBuilder;
import Creational.Factory.Shape;
import Creational.Factory.ShapeFactory;
import Creational.Prototype.ShapeCache;

/**
 * Created by zero on 15-8-28.
 */
public class Main {

    public static void main(String[] args) {
//        testFactory();
//        testAbstractFactory();
//        testBuilder();
//        testPrototype();
//        testAdapter();
        testBridge();
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
        Creational.Prototype.Shape clonedShape = (Creational.Prototype.Shape) ShapeCache.getShape("1");
        clonedShape.setName("CIRCLE");
        System.out.println("Shape : " + clonedShape.getType() + clonedShape.getName());
        Creational.Prototype.Shape clonedShape2 = (Creational.Prototype.Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape2.getType() + clonedShape2.getName());
        Creational.Prototype.Shape clonedShape3 = (Creational.Prototype.Shape) ShapeCache.getShape("3");
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

    public static void testBridge() {
        Structural.Bridge.Shape redCircle = new Structural.Bridge.Circle(100,100, 10, new Structural.Bridge.RedCircle());
        Structural.Bridge.Shape greenCircle = new Structural.Bridge.Circle(100,100, 10, new Structural.Bridge.GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
