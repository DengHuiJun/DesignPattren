package Prototype;

import java.util.Hashtable;

/**
 * 原型模式关键:
 * 拷贝这些原型创建新的对象。
 * Created by zero on 15-9-1.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        circle.setName("circle");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        square.setName("square");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        rectangle.setName("rect");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
