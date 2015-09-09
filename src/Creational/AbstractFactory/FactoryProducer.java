package Creational.AbstractFactory;

import Creational.Factory.ShapeFactory;

/**
 * Created by zero on 15-8-31.
 */
public class FactoryProducer {
    public static AbstractFactoty getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
