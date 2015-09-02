package SingleTon;

/**
 * 懒汉式，线程不安全
 * Created by zero on 15-8-28.
 */
public class SingleTonOne {
    private static SingleTonOne singleTon ;

    private SingleTonOne(){

    }

    private static SingleTonOne getInstance() {
        if (singleTon == null) {
            singleTon = new SingleTonOne();
        }
        return singleTon;
    }
}
