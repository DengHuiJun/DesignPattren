package Builder;

/**
 * 真正的建造者.
 * 使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。
 * 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
 * Created by zero on 15-8-31.
 */
public class MealBuilder {

    public Meal getMealVegCoke() {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        return m;
    }

    public Meal getMealChickPesi() {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Pepsi());
        return m;
    }
}
