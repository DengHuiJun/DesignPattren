package Flyweight;

/**
 * 享元模式何时用：
 *  1、系统中有大量对象。
 *  2、这些对象消耗大量内存。
 *  3、这些对象的状态大部分可以外部化。
 *  4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。
 *  5、系统不依赖于这些对象身份，这些对象是不可分辨的。
 *
 *  应用实例：
 *  1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
 *  2、数据库的数据池。
 * Created by zero on 15-9-6.
 */
public class FlyweightDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
