package Creational.AbstractFactory;

import Creational.Factory.Shape;

/**
 * 使用场景： 1、QQ 换皮肤，一整套一起换。 2、生成不同操作系统的程序。
 * Created by zero on 15-8-31.
 */
public abstract class AbstractFactoty {
    public abstract Color getColor(int color);
    public abstract Shape getShape(int shape);
}
