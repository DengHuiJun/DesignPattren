package Creational.Prototype;

/**
 * Created by zero on 15-8-31.
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    private String name;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object clone() {
        Object clone = null;
        try {
            //重新复制一个
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
