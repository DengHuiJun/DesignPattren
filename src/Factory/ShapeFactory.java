package Factory;

import AbstractFactory.*;

/**
 * 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
 * 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
 * 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 * Created by zero on 15-8-31.
 */
public class ShapeFactory extends AbstractFactoty{
    public static final int CIRCLE = 1;
    public static final int TRI = 2;
    public static final int RECT = 3;

    @Override
    public Shape getShape(int shape){
        switch (shape) {
            case CIRCLE:
                return new Circle();
            case RECT:
                return new Rect();
            case TRI:
                return new Tri();
            default:
                return null;
        }
    }

    @Override
    public Color getColor(int color) {
        return null;
    }

}
